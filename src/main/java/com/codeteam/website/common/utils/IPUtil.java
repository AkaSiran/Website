package com.codeteam.website.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Fyc on 2021-7-15.
 * IP工具
 */
@Slf4j
public class IPUtil
{
    /**
     * 获取公网IP
     * @param request
     * @return
     * @throws Exception
     */
    public static String getOuterNetIp(HttpServletRequest request)
    {
        String ipAddr = getLocalIp(request);//获取ip地址
        boolean internalIp = internalIp(ipAddr);//判断ip是否内网ip
        log.info("ipAddr={}", ipAddr);
        log.info("internalIp={}", internalIp);
        if (!internalIp)
        {//外网地址直接返回
            log.info("直接返回外网IP={}", ipAddr);
            return ipAddr;
        }
        String result = "";
        URLConnection connection;
        BufferedReader in = null;
        try
        {
            URL url = new URL("http://www.icanhazip.com");
            connection = url.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "KeepAlive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null)
            {
                result += line;
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
        }
        finally
        {
            try
            {
                if (in != null)
                {
                    in.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static String getLocalIp(HttpServletRequest request)
    {
        String ip = null;
        try
        {
            ip = request.getHeader("x-forwarded-for");
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (StringUtils.isEmpty(ip) || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip))
            {
                ip = request.getRemoteAddr();
            }
        }
        catch (Exception e)
        {
            log.error("IPUtils ERROR ", e);
        }

        //使用代理，则获取第一个IP地址
        if (StringUtils.isEmpty(ip) && ip.length() > 15)
        {
            if (ip.indexOf(",") > 0)
            {
                ip = ip.substring(0, ip.indexOf(","));
            }
        }
        return ip;
    }

    public static boolean internalIp(String ip)
    {
        if ("127.0.0.1".equalsIgnoreCase(ip))
            return true;
        if ("0:0:0:0:0:0:0:1".equals(ip))
            return true;
        byte[] addr = IPAddressUtil.textToNumericFormatV4(ip);
        return internalIp(addr);
    }

    public static boolean internalIp(byte[] addr)
    {
        final byte b0 = addr[0];
        final byte b1 = addr[1];
        // 10.x.x.x/8
        final byte SECTION_1 = 0x0A;
        // 172.16.x.x/12
        final byte SECTION_2 = (byte) 0xAC;
        final byte SECTION_3 = (byte) 0x10;
        final byte SECTION_4 = (byte) 0x1F;
        // 127.0.0.1/16
        final byte SECTION_5 = (byte) 0xC0;
        final byte SECTION_6 = (byte) 0xA8;
        switch (b0)
        {
            case SECTION_1:
                return true;
            case SECTION_2:
                if (b1 >= SECTION_3 && b1 <= SECTION_4)
                {
                    return true;
                }
            case SECTION_5:
                switch (b1)
                {
                    case SECTION_6:
                        return true;
                }
            default:
                return false;
        }
    }
}
