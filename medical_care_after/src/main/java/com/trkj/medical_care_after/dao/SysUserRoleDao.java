package com.trkj.securityboot.dao;


import com.trkj.medical_care_after.entity.SysUserRole;

public interface SysUserRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}