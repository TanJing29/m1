package com.trkj.medical_care_after.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * sys_user_role
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole implements Serializable {
    private Integer id;

    /**
     * 角色自增id
     */
    private Integer roleId;

    /**
     * 用户自增id
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;
}