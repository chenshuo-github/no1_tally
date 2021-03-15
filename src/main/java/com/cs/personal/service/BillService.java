package com.cs.personal.service;

import com.cs.personal.dto.BillDto;

/**
 * @author: cs
 * @date 2021-03-15
 * @decription Service接口
 */
public interface BillService {

    /**
     * 新增
     * @param billDto 实体
     */
    void insertBill(BillDto billDto);

    /**
     * 根据id删除
     * @param billDto 实体
     * @return boolean
     */
    Boolean deleteBillById(BillDto billDto);

    /**
     * 修改
     * @param billDto 实体
     * @return 实体
     */
    BillDto updateBill(BillDto billDto);

    /**
     * 根据id查询
     * @param id id
     * @return 实体
     */
    BillDto selectBillById(Integer id);

    /**
     * 查询是否存在
     * @param billDto 实体
     * @return boolean
     */
    Boolean selectBillWhether(BillDto billDto);

}
