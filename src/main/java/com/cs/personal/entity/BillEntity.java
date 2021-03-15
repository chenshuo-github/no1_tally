package com.cs.personal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * a_bill
 * @author cs
 */
@Data
public class BillEntity implements Serializable {
    /**
     * 主键id
     */
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    /**
     * 饭费
     */
    private Double mealFee;

    /**
     * 网购费用
     */
    private Double onlineShoppingFee;

    /**
     * 备注
     */
    private String note;

    /**
     * 其他费用
     */
    private Double otherFee;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

}