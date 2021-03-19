package com.cs.personal.service;

import com.cs.personal.dto.Result;
import com.cs.personal.dto.UserDto;

/**
 * @author cs
 * @date 2021-03-04
 * @decription Service接口
 */
public interface UserService {

    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     * @return 实体
     */
    UserDto queryUserInfo(Integer userName);

    /**
     * 添加用户
     * @param userDto 实体
     * @return 返回体
     */
    Result addUserInfo(UserDto userDto);

}
