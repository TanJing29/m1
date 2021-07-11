package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * accounts_payable_sta
 * @author 
 */
@Data
public class AccountsPayableSta implements Serializable {
    /**
     * 应付账款统计id
     */
    private Integer apsId;

    /**
     * 供商编号
     */
    private Integer suppId;

    /**
     * 应付金额
     */
    private BigDecimal apsApay;

    /**
     * 实付金额
     */
    private BigDecimal apsAcpay;

    /**
     * 欠款金额
     */
    private BigDecimal apsOwe;

    private static final long serialVersionUID = 1L;
}