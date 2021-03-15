package com.cs.personal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cs.personal.entity.BillEntity;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/15 14:41
 * @description：cs
 * @version: 1.0$
 */
public interface BillMapper extends BaseMapper<BillEntity> {

    /**
     * 根据主键删除
     * @param id 主键
     * @return 返回值
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     * @param record 实体
     * @return 返回值
     */
    void insertBillEntity(BillEntity record);

    /**
     * 根据主键查询
     * @param id 主键
     * @return 返回值
     */
    BillEntity selectByPrimaryKey(Integer id);

    /**
     * 根据主键修改其他信息(判空)
     * @param record 实体
     * @return 返回值
     */
    int updateByPrimaryKeySelective(BillEntity record);

    /**
     * 根据主键修改其他信息
     * @param record 实体
     * @return 返回值
     */
    int updateByPrimaryKey(BillEntity record);
}