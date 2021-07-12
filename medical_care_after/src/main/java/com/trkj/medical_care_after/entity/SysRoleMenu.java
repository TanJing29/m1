package com.trkj.medical_care_after.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * sys_role_menu
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleMenu implements Serializable {
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer menuId;

    private static final long serialVersionUID = 1L;
}