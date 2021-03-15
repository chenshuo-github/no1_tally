package com.cs.personal.dto;

import lombok.Data;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/3/15 14:38
 * @description：前端账单对象
 * @version: 1.0$
 */
@Data
public class BillDto {

    private Integer id;
    private Double mealFee;
    private Double onlineShoppingFee;
    private Double otherFee;
    private String note;
}
