package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * return_frmloss
 * @author 
 */
@Data
public class ReturnFrmloss implements Serializable {
    /**
     * 退回报损登记主键
     */
    private Integer rfid;

    /**
     * 客户主键
     */
    private Integer conId;

    /**
     * 出库登记主键
     */
    private Integer did;

    /**
     * 商品主键
     */
    private Integer sid;

    /**
     * 退回数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private Long price;

    /**
     * 退回金额
     */
    private Long amountMoney;

    /**
     * 退回原因
     */
    private String rfReason;

    /**
     * 退回日期
     */
    private Date rfDate;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}