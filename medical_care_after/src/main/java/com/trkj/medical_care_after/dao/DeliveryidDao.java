package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Deliveryid;

public interface DeliveryidDao {
    int deleteByPrimaryKey(Integer did);

    int insert(Deliveryid record);

    int insertSelective(Deliveryid record);

    Deliveryid selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Deliveryid record);

    int updateByPrimaryKey(Deliveryid record);
}