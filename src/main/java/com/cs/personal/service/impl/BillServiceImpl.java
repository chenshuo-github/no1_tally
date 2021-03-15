package com.cs.personal.service.impl;

import com.cs.personal.dto.BillDto;
import com.cs.personal.entity.BillEntity;
import com.cs.personal.mapper.BillMapper;
import com.cs.personal.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/15 16:14
 * @description：账单实现类
 * @version: 1.0$
 */
@Service(value = "BillService")
public class BillServiceImpl implements BillService {

    @Resource
    private BillMapper billMapper;

    @Override
    public void insertBill(BillDto billDto) {
        BillEntity billEntity = toBillEntity(billDto);
        //返回主键
        billMapper.insertBillEntity(billEntity);
    }

    @Override
    public Boolean deleteBillById(BillDto billDto) {
        int i = billMapper.deleteByPrimaryKey(billDto.getId());
        return i == 1;
    }

    @Override
    public BillDto updateBill(BillDto billDto) {
        BillEntity billEntity = toBillEntity(billDto);
        int i = billMapper.updateByPrimaryKeySelective(billEntity);
        if (1 == i) {
            return billDto;
        }
        return null;
    }

    @Override
    public BillDto selectBillById(Integer id) {
        BillEntity billEntity = billMapper.selectByPrimaryKey(id);
        if (null != billEntity) {
            return toBillDto(billEntity);
        }
        return null;
    }

    @Override
    public Boolean selectBillWhether(BillDto billDto) {
        BillEntity billEntity = billMapper.selectByPrimaryKey(billDto.getId());
        return null != billEntity;
    }

    private BillEntity toBillEntity(BillDto billDto) {
        BillEntity billEntity = new BillEntity();
        billEntity.setId(billDto.getId());
        billEntity.setMealFee(billDto.getMealFee());
        billEntity.setOnlineShoppingFee(billDto.getOnlineShoppingFee());
        billEntity.setOtherFee(billDto.getOtherFee());
        billEntity.setNote(billDto.getNote());
        return billEntity;
    }

    private BillDto toBillDto(BillEntity billEntity) {
        BillDto billDto = new BillDto();
        billDto.setId(billEntity.getId());
        billDto.setMealFee(billEntity.getMealFee());
        billDto.setOnlineShoppingFee(billEntity.getOnlineShoppingFee());
        billDto.setOtherFee(billEntity.getOtherFee());
        billDto.setNote(billEntity.getNote());
        return billDto;
    }
}
