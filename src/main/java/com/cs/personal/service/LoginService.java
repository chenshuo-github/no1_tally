package com.cs.personal.service;

public interface LoginService {

    /**
     * 查询用户是否存在
     * @param userName 用户名
     * @param password 密码
     * @return 布尔
     */
    boolean login(String userName,String password);
}
