package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.vo.FlowetdetailedVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FlowetdetailedDao {
    int deleteByPrimaryKey(Integer fid);

    int insert(FlowetdetailedVo record);

    int insertSelective(FlowetdetailedVo record);

    FlowetdetailedVo selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(FlowetdetailedVo record);

    int updateByPrimaryKey(FlowetdetailedVo record);

    List<FlowetdetailedVo> selAllFlowet();//查询所有

    List<FlowetdetailedVo> selstatus();//查询状态为1的



}