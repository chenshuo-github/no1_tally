package com.cs.personal.dto;

import lombok.Data;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/11 16:42
 * @description：请求返回参数对象
 * @version: 1.0$
 */
@Data
public class Result {

    /**
     * 返回状态码
     */
    private String code;

    /**
     * 返回描述
     */
    private String message;

    /**
     * 返回体
     */
    private Object msgBody;
}
