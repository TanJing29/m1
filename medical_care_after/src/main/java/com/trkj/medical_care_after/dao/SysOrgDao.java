package com.trkj.securityboot.dao;

import com.trkj.medical_care_after.entity.SysOrg;

public interface SysOrgDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOrg record);

    int insertSelective(SysOrg record);

    SysOrg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOrg record);

    int updateByPrimaryKey(SysOrg record);
}