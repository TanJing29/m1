package com.trkj.medical_care_after.controller;

import com.trkj.securityboot.vo.AjaxResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/DeptMain")
@RestController
@Slf4j
public class SysDeptController {
    @PostMapping("/addDept")
    @ApiOperation(value = "添加部门，成功后进入show页面，显示部门信息", notes = "添加", httpMethod = "POST")
    public AjaxResponse addDept(){
        log.debug("开始添加部门");
        return AjaxResponse.success("部门添加成功！");
    }
    @PutMapping("/eidtDept")
    @ApiOperation(value = "修改部门，成功后进入show页面，显示部门信息", notes = "修改", httpMethod = "PUT")
    public AjaxResponse eidtDept(){
        log.debug("开始修改部门");
        return AjaxResponse.success("修改部门成功！");
    }
    @DeleteMapping("/delDept")
    public AjaxResponse delDept(){
        log.debug("开始删除部门");
        return AjaxResponse.success("删除部门成功！");
    }
    @GetMapping("/findDept")
    public AjaxResponse findDept(){
        log.debug("开始查询部门");
        return AjaxResponse.success("查询部门成功！");
    }
}
