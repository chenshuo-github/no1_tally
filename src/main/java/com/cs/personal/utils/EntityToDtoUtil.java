package com.cs.personal.utils;

import com.cs.personal.dto.UserDto;
import com.cs.personal.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/5 15:15
 * @description：逻辑层与表现层之间的类型转换
 * @version: 1.0$
 */
@Component
public class EntityToDtoUtil {

    /**
     * 逻辑层转表现层
     * @param userEntity 逻辑层
     * @return 表现层
     */
    public UserDto toUserDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setUserName(userEntity.getUserName());
        userDto.setPassword(userEntity.getPassword());
        userDto.setPermission(userEntity.getPermission());
        userDto.setCreateTime(userEntity.getCreateTime());
        userDto.setUpdateTime(userEntity.getUpdateTime());
        return userDto;
    }
}
