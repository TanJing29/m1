package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.vo.FlowetdetailedVo;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-12 11:54
 * @Version 1.0
 */
public interface FlowetdetailedService {
    List<FlowetdetailedVo> selAllFlowet();//查询所有
    List<FlowetdetailedVo> selstatus();//查询状态为1的
}
