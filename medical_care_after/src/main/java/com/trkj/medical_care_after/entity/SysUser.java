package com.trkj.medical_care_after.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * sys_user
 * @author 大熊
 */
@Data
@AllArgsConstructor
public class SysUser implements UserDetails {
    //@JsonCreator
    public SysUser(){

    }
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 组织id
     */
    private Integer orgId;

    /**
     * 0无效用户，1是有效用户
     */
    private Boolean enabled;

    /**
     * 手机号
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * 账户是否没过期
     */
    private Boolean accountNonExpired;

    /**
     * 是否没被锁定
     */
    private Boolean accountNonLocked;

    /**
     * 密码是否没有过期
     */
    private Boolean credentialsNonExpired;

    private static final long serialVersionUID = 1L;

    Collection<? extends GrantedAuthority> authorities;  //用户的权限集合
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}