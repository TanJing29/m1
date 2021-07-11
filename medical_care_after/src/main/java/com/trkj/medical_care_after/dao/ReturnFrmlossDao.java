package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.ReturnFrmloss;

public interface ReturnFrmlossDao {
    int deleteByPrimaryKey(Integer rfid);

    int insert(ReturnFrmloss record);

    int insertSelective(ReturnFrmloss record);

    ReturnFrmloss selectByPrimaryKey(Integer rfid);

    int updateByPrimaryKeySelective(ReturnFrmloss record);

    int updateByPrimaryKey(ReturnFrmloss record);
}