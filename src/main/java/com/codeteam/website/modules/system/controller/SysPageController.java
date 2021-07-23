package com.codeteam.website.modules.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fyc on 2021-7-13.
 * 系统页面
 */
@Controller
@RequestMapping("/sys/page")
public class SysPageController
{
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }
}
