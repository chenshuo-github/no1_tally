package com.cs.personal.service.impl;

import com.cs.personal.dto.ResultObject;
import com.cs.personal.dto.UserDto;
import com.cs.personal.entity.UserEntity;
import com.cs.personal.mapper.UserMapper;
import com.cs.personal.service.UserService;
import com.cs.personal.utils.EntityToDtoUtil;
import com.cs.personal.utils.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/4 17:38
 * @description：用户实现类
 * @version: 1.0$
 */
@Service(value = "UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private EntityToDtoUtil entityToDtoUtil;

    @Resource
    private ResultUtil resultUtil;

    @Override
    public UserDto queryUserInfo(Integer id) {
        UserEntity userEntity = userMapper.selectByPrimaryKey(id);
        return entityToDtoUtil.toUserDto(userEntity);
    }

    @Override
    public ResultObject addUserInfo(UserDto userDto) {
        UserEntity userEntity = toUserEntity(userDto);
        userMapper.insertUserEntity(userEntity);
//        if (1 == num) {
//            return resultUtil.success();
//        } else {
//            return resultUtil.fail();
//        }
        return resultUtil.success();
    }

    private UserEntity toUserEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDto.getUserName());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setPermission(userDto.getPermission());
        return userEntity;
    }
}
