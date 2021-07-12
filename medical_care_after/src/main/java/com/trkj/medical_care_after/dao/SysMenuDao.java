package com.trkj.securityboot.dao;

import com.trkj.medical_care_after.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SysMenuDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<String> findAuthorityByRoleCodes(@Param("roleCodes") List<String> roleCodes);
    List<SysMenu> findMenusByRoleCodes(@Param("roleCodes") List<String> roleCodes);
}