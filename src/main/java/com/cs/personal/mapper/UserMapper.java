package com.cs.personal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cs.personal.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/5 14:41
 * @description：用户
 * @version: 1.0$
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    /**
     * 根据主键删除用户信息
     * @param id 主键
     * @return 返回值
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加用户信息
     * @param record 用户信息
     * @return 返回值
     */
    int insertUserEntity(UserEntity record);

    /**
     * 根据主键查询用户信息
     * @param id 主键
     * @return 返回值
     */
    UserEntity selectByPrimaryKey(Integer id);

    /**
     * 根据用户名密码查询用户
     * @param userName 用户名
     * @param password 密码
     * @return 返回值
     */
    UserEntity selectByUserNameAndPassword(String userName, String password);

    /**
     * 修改用户信息
     * @param record 用户信息
     * @return 返回值
     */
    int updateByPrimaryKey(UserEntity record);
}