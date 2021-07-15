package com.codeteam.website.common.core;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Fyc on 2021-7-15.
 * 基础入参Dto
 */
@Data
public class BaseRequestDto implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Long id;
}
