package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Inventory;

public interface InventoryDao {
    int deleteByPrimaryKey(Integer inId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer inId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}