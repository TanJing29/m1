package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.service.FlowetdetailedService;
import com.trkj.medical_care_after.vo.FlowetdetailedVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-12 11:55
 * @Version 1.0
 */
@RestController
@Slf4j
public class FlowetdetailedController {
    @Autowired
    private FlowetdetailedService flowetdetailedService;


    /*
    *查询显示所有的流程
    * currentPage 当前页
    * pagesize  页码数量
    */
    @GetMapping("/selAllFlowet")
    public PageInfo<FlowetdetailedVo> selAllFlowet(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<FlowetdetailedVo> list=flowetdetailedService.selAllFlowet();
        PageInfo<FlowetdetailedVo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    /*
    *
    * 查询显示审批中的数据
    * */
    @GetMapping("/selstatus")
    public PageInfo<FlowetdetailedVo> selstatus(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<FlowetdetailedVo> list=flowetdetailedService.selstatus();
        PageInfo<FlowetdetailedVo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }



}
