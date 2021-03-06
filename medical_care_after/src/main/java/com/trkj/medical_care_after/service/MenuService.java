package com.trkj.medical_care_after.service;



import com.trkj.securityboot.vo.MenuVo;

import java.util.List;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:菜单（权限）业务接口
 * @version 1.0
 */
public interface MenuService {
    public List<MenuVo> findMenuByPidAndLevel(int pid, byte level);

}
