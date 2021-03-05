package com.cs.personal.service;

import com.cs.personal.dto.UserDto;

/**
 * @author thinkpad
 * @date 2021-03-04
 * @decription
 */
public interface UserService {

    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     * @return 实体
     */
    public UserDto queryUserInfo(Integer userName);

}
