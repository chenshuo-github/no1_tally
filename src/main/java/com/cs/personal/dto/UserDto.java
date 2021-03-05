package com.cs.personal.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/4 17:27
 * @description：前端用户
 * @version: 1.0$
 */
@Data
public class UserDto {

    private Integer id;
    private String userName;
    private String password;
    private Integer permission;
    private Date createTime;
    private Date updateTime;

}
