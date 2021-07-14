package com.codeteam.website.common.core;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Fyc on 2021-7-12.
 * 基础返回Dto
 */
@Data
public class BaseResponseDto<T> implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Long id;
}
