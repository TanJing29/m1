package com.trkj.medical_care_after.controller;

import com.trkj.securityboot.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SysMain")
@Slf4j
public class SysAdviceController {
    @PostMapping("/advice")
    public AjaxResponse addAdvice(){
        log.debug("开始添加通知");
        return AjaxResponse.success("通知添加成功！");
    }
}
