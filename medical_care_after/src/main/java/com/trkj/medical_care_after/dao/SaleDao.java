package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Sale;
import com.trkj.medical_care_after.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SaleDao {
    int deleteByPrimaryKey(Integer said);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Integer said);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);

    List<Sale> findAll();
}