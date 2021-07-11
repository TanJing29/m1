package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * other_income_and_expenditure
 * @author 
 */
@Data
public class OtherIncomeAndExpenditure implements Serializable {
    /**
     * 其他收支id
     */
    private Integer otrId;

    /**
     * 日期
     */
    private Date otrTime;

    /**
     * 项目
     */
    private String otrProject;

    /**
     * 金额
     */
    private BigDecimal otrMoney;

    /**
     * 结算方式
     */
    private String otrSettlement;

    /**
     * 备注
     */
    private String otrRemarks;

    /**
     * 经办人
     */
    private String otrAgent;

    /**
     * 操作者
     */
    private String otrOperator;

    private static final long serialVersionUID = 1L;
}