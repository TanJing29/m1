package com.trkj.medical_care_after.service;


import com.trkj.securityboot.dao.SysMenuDao;
import com.trkj.securityboot.dao.SysRoleDao;
import com.trkj.securityboot.dao.SysUserDao;
import com.trkj.securityboot.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:自定义的UserDetailsService业务实现类
 * @version 1.0
 */
@Slf4j
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysRoleDao sysRoleDao;
    @Autowired
    private SysMenuDao sysMenuDao;
    @Override
    @Cacheable(value = "user",key = "#username", unless="#result == null")
    public SysUser loadUserByUsername(String username) throws UsernameNotFoundException {
       log.debug("开始加载基础用户信息");
        //加载基础用户信息
        SysUser myUserDetails = sysUserDao.findByUsername(username);
        if (myUserDetails==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        log.debug("开始加载角色信息");
        //加载角色信息
        List<String> roleCodes=sysRoleDao.findRoleByUserName(myUserDetails.getUsername());
        log.debug("开始加载权限信息");
        //根据角色列表加载当前用户
       //根据角色列表加载当前用户具有的权限
        List<String> authorities =sysMenuDao.findAuthorityByRoleCodes(roleCodes);
        //为角色标识加上ROLE_前缀（Spring Security规范）
        roleCodes = roleCodes.stream()
                .map(rc -> "ROLE_" + rc)
                .collect(Collectors.toList());
        authorities.addAll(roleCodes);
        //设置用户权限
        myUserDetails.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(
                String.join(",",authorities)
        ));

        log.info("用户查询完成，返回user,其权限为:"+myUserDetails.getAuthorities());
        return myUserDetails;
    }
}
