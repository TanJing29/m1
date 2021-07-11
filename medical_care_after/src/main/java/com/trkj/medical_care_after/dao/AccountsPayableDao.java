package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.AccountsPayable;

public interface AccountsPayableDao {
    int deleteByPrimaryKey(Integer apId);

    int insert(AccountsPayable record);

    int insertSelective(AccountsPayable record);

    AccountsPayable selectByPrimaryKey(Integer apId);

    int updateByPrimaryKeySelective(AccountsPayable record);

    int updateByPrimaryKey(AccountsPayable record);
}