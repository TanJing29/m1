package com.trkj.medical_care_after.service;

import com.trkj.securityboot.entity.SysMenu;

import java.util.List;

public interface SysPermissionService {
    public List<SysMenu> getMenuByUname(String userName);
}
