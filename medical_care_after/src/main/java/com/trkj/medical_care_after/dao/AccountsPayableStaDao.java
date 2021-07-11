package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.AccountsPayableSta;

public interface AccountsPayableStaDao {
    int deleteByPrimaryKey(Integer apsId);

    int insert(AccountsPayableSta record);

    int insertSelective(AccountsPayableSta record);

    AccountsPayableSta selectByPrimaryKey(Integer apsId);

    int updateByPrimaryKeySelective(AccountsPayableSta record);

    int updateByPrimaryKey(AccountsPayableSta record);
}