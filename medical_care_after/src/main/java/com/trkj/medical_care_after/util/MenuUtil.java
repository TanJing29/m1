package com.trkj.medical_care_after.util;

import com.trkj.medical_care_after.entity.SysMenu;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MenuUtil {
    public static List<SysMenu> assemberMenus(List<SysMenu> menus){
        List<SysMenu> one=menus.stream().filter(u -> u.getMenuPid()==0).collect(Collectors.toList());
        log.debug(one.toString());
        one.forEach(o->{
            List<SysMenu> two=menus.stream().filter(u -> u.getMenuPid().equals(o.getId())).collect(Collectors.toList());
            o.setAsideChildren(two);
        });
        return one;
    }
}
