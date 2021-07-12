package com.trkj.medical_care_after.service;

import com.trkj.securityboot.dao.SysMenuDao;
import com.trkj.securityboot.dao.SysRoleDao;
import com.trkj.securityboot.entity.SysMenu;
import com.trkj.securityboot.util.MenuUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysRoleDao roleDao;
    @Autowired
    private SysMenuDao menuDao;
    @Override
    public List<SysMenu> getMenuByUname(String userName) {
        List<SysMenu> list=menuDao.findMenusByRoleCodes( this.getRoleCodesByUname(userName));
        return MenuUtil.assemberMenus(list);
    }
    private List<String> getRoleCodesByUname(String userName){
        return roleDao.findRoleByUserName(userName);
    }
}
