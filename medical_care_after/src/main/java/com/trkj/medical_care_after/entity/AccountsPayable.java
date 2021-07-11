package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * accounts_payable
 * @author 
 */
@Data
public class AccountsPayable implements Serializable {
    /**
     * 登记id
     */
    private Integer apId;

    /**
     * 付款款日期
     */
    private Date apStime;

    /**
     * 供商编号
     */
    private Integer suppId;

    /**
     * 欠款金额
     */
    private BigDecimal apOwe;

    /**
     * 付款金额
     */
    private BigDecimal apPayment;

    /**
     * 还欠金额
     */
    private BigDecimal apOwes;

    /**
     * 经办人
     */
    private String apAgent;

    /**
     * 备注
     */
    private String apRemarks;

    /**
     * 操作者
     */
    private String apOperator;

    private static final long serialVersionUID = 1L;
}