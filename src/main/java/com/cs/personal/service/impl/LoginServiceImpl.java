package com.cs.personal.service.impl;

import com.cs.personal.entity.UserEntity;
import com.cs.personal.mapper.UserMapper;
import com.cs.personal.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cs
 * @date 2021/3/12
 * @decription
 */
@Service(value = "LoginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean login(String userName,String password) {
        UserEntity userEntity = userMapper.selectByUserNameAndPassword(userName, password);
        if (null == userEntity) {
            return false;
        } else {
            return true;
        }
    }
}
