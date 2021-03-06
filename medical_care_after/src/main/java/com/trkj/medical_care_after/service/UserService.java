package com.trkj.medical_care_after.service;



import com.trkj.securityboot.vo.UserVo;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:系统用户业务接口，不同于MyUserDetailsService，MyUserDetailsService主要用于为系统提供验证。
 * @version 1.0
 */
public interface UserService {
   // public List<UserVo> findAll();
   // public UserVo addUser(UserVo user);
   // public UserVo editUser(UserVo user);
   // public void delUser(Integer id);
    public UserVo findByUsername(String username);
}
