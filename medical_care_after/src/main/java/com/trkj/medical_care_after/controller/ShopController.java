package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.entity.Shop;
import com.trkj.medical_care_after.service.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ShopController {
    @Autowired
    private ShopService service;
    @GetMapping("/findAllShop")
    public List<Shop> findAll(){
        List<Shop> list=service.selectByPrimaryKey();
        log.debug(list.toString());
        return list;
    }
}
