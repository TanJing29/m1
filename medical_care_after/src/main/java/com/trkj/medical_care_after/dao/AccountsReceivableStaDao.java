package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.AccountsReceivableSta;

public interface AccountsReceivableStaDao {
    int deleteByPrimaryKey(Integer arsId);

    int insert(AccountsReceivableSta record);

    int insertSelective(AccountsReceivableSta record);

    AccountsReceivableSta selectByPrimaryKey(Integer arsId);

    int updateByPrimaryKeySelective(AccountsReceivableSta record);

    int updateByPrimaryKey(AccountsReceivableSta record);
}