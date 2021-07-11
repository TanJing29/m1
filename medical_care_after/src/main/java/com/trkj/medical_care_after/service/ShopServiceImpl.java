package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.ShopDao;
import com.trkj.medical_care_after.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    public List<Shop> selectByPrimaryKey() {
        return shopDao.findAll();
    }
}
