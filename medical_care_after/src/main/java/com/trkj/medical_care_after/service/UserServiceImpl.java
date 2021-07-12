package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.SysUserDao;
import com.trkj.medical_care_after.entity.SysUser;
import com.trkj.medical_care_after.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private  static DozerBeanMapper dozerBeanMapper=new DozerBeanMapper();
    @Resource
    private SysUserDao userDao;

    public UserServiceImpl() {
    }

  /*  @Override
    public List<UserVo> findAll() {
        List<SysUser> list= userDao.findAll();
        return DozerUtils.mapList(list,UserVo.class);
    }*/

  /*  @Override
    public UserVo addUser(UserVo user) {
        return null;
    }

    @Override
    @Transactional
    public UserVo editUser(UserVo user) {
        log.info("UserServiceImpl开始更新用户信息");
        SysUser sysUser=new SysUser();
        dozerBeanMapper.map(user,sysUser);
        userDao.save(sysUser);
        return user;
    }*/

   /* @Override
    public void delUser(Integer id) {

    }*/

    @Override
    public UserVo findByUsername(String username) {
        SysUser user=userDao.findByUsername(username);
        UserVo vo=new UserVo();
        dozerBeanMapper.map(user,vo);
        return vo;
    }
}
