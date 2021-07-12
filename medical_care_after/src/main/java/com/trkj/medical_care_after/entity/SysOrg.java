package com.trkj.medical_care_after.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * sys_org
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysOrg implements Serializable {
    private Integer id;

    /**
     * 上级组织编码
     */
    private Integer orgPid;

    /**
     * 所有的父节点id
     */
    private String orgPids;

    /**
     * 0:不是叶子节点，1:是叶子节点
     */
    private Byte isLeaf;

    /**
     * 组织名
     */
    private String orgName;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮件
     */
    private String email;

    /**
     * 排序
     */
    private Byte sort;

    /**
     * 组织层级
     */
    private Byte level;

    /**
     * 0:启用,1:禁用
     */
    private Byte status;

    private static final long serialVersionUID = 1L;
}