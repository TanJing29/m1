package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * deliveryid
 * @author 
 */
@Data
public class Deliveryid implements Serializable {
    /**
     * 出库登记主键
     */
    private Integer did;

    /**
     * 商品主键
     */
    private Integer sid;

    /**
     * 客户主键
     */
    private Integer conId;

    /**
     * 销售总表主键
     */
    private Integer said;

    /**
     * 出库单号
     */
    private String deliveryOrderNo;

    /**
     * 单价
     */
    private Long price;

    /**
     * 数量
     */
    private Integer quantity;

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
     * 出库状态
     */
    private Integer state;

    /**
     * 出库时间
     */
    private Date ddate;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}