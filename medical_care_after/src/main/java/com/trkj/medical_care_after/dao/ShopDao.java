package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Shop;

public interface ShopDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}