package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.FlowetdetailedDao;
import com.trkj.medical_care_after.vo.FlowetdetailedVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-12 11:54
 * @Version 1.0
 */
@Service
@Slf4j
public class FlowetdetailedServiceImpl implements FlowetdetailedService {
    @Resource
    private FlowetdetailedDao flowetdetailedDao;

    @Override
    @Transactional/*事物注解*/
    public List<FlowetdetailedVo> selAllFlowet() {
        return flowetdetailedDao.selAllFlowet();
    }

    @Override
    public List<FlowetdetailedVo> selstatus() {
        return flowetdetailedDao.selstatus();
    }
}
