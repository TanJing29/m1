package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.AccountsReceivable;

public interface AccountsReceivableDao {
    int deleteByPrimaryKey(Integer arId);

    int insert(AccountsReceivable record);

    int insertSelective(AccountsReceivable record);

    AccountsReceivable selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(AccountsReceivable record);

    int updateByPrimaryKey(AccountsReceivable record);
}