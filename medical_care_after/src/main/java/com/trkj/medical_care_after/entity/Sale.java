package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sale
 * @author 
 */
@Data
public class Sale implements Serializable {
    /**
     * 销售总表主键
     */
    private Integer said;

    /**
     * 客户主键
     */
    private Integer conId;

    /**
     * 商品主键
     */
    private Integer sid;

    /**
     * 销售单号
     */
    private String salesOrderNo;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private Long price;

    /**
     * 应收金额
     */
    private Long amountReceivable;

    /**
     * 实收金额
     */
    private Long actualMoney;

    /**
     * 欠收金额
     */
    private Long oweMoney;

    /**
     * 销售状态
     */
    private Integer state;

    /**
     * 销售日期
     */
    private Date saleDate;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}