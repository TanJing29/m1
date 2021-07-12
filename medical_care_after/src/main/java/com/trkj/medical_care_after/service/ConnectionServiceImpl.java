package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.ConnectionDao;
import com.trkj.medical_care_after.entity.Connection;
import com.trkj.medical_care_after.util.BeanCopyUtil;
import com.trkj.medical_care_after.vo.ConnectionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 19:45
 * @Version 1.0
 */
@Service
@Slf4j
public class ConnectionServiceImpl implements ConnectionService {
    @Resource
    private ConnectionDao connectionDao;

    @Override
    public List<ConnectionVo> selConnection() {
        return connectionDao.selConnection();
    }

    @Override
    public List<ConnectionVo> selmhConnection(String connectionName) {
        return connectionDao.selmhConnection(connectionName);
    }

    @Override
    public ConnectionVo addConnection(ConnectionVo connectionVo) {
        Connection connection=new Connection();
        BeanCopyUtil.copyProperties(connectionVo,connection);
        connectionDao.insertSelective(connectionVo);
        return connectionVo;
    }

    @Override
    public ConnectionVo updConnection(ConnectionVo connectionVo) {
        Connection con=new Connection();
        con.setUpdatetime(new Date());
        connectionDao.updateByPrimaryKeySelective(connectionVo);
        return connectionVo;
    }

    @Override
    public int delConnection(Integer conId) {
        ConnectionVo con=new ConnectionVo();
        con.setConId(conId);
        con.setDeletetime(new Date());
        con.setTimeliness(1);
        return connectionDao.updateByPrimaryKeySelective(con);
    }
}
