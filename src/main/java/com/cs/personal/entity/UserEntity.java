package com.cs.personal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/4 10:51
 * @description：用户
 * @version: 1.0$
 */
@Data
@TableName("a_user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,添加注解value:数据库字段值,type:AUTO表示自增ID
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户权限
     0:root权限
     1:普通管理员权限
     */
    private Integer permission;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
