package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * accounts_receivable_sta
 * @author 
 */
@Data
public class AccountsReceivableSta implements Serializable {
    /**
     * 应收账款统计id
     */
    private Integer arsId;

    /**
     * 客户编号
     */
    private Integer conId;

    /**
     * 应付金额
     */
    private BigDecimal arsApay;

    /**
     * 实付金额
     */
    private BigDecimal arsAcpay;

    /**
     * 欠款金额
     */
    private BigDecimal arsOwe;

    private static final long serialVersionUID = 1L;
}