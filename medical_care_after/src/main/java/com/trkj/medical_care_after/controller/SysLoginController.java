package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.entity.SysMenu;
import com.trkj.medical_care_after.service.JwtAuthService;
import com.trkj.medical_care_after.service.SysPermissionService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.vo.LoginVo;
import com.trkj.medical_care_after.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SysLoginController {
    @Autowired
    private JwtAuthService jwtAuthService;
    @Autowired
    private SysPermissionService permissionService;
    @PostMapping("/signout")
    public AjaxResponse signout(){
        log.debug("开始退出操作");
        AjaxResponse ajaxResponse=AjaxResponse.success("已退出");
        SecurityContextHolder.clearContext();
        return ajaxResponse;
    }
    @PostMapping("/login")
    public AjaxResponse login(@RequestBody LoginVo loginVo){
        log.debug("开始验证,{}",loginVo);
        String token=jwtAuthService.login(loginVo.getUsername(),loginVo.getPassword());
        List<SysMenu> menus=permissionService.getMenuByUname(loginVo.getUsername());
        log.debug(menus.toString());
        UserVo vo=new UserVo();
        vo.setUsername(loginVo.getUsername());
        vo.setValidate(true);
        vo.setMenus(menus);
        vo.setToken(token);
        return AjaxResponse.success(vo);
    }
}
