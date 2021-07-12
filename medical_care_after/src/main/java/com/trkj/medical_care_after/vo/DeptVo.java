package com.trkj.medical_care_after.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptVo {
    @Max(value = 10000,message = "编号不能超过10000")
    private int deptno;
    @NotEmpty(message = "姓名不能为空")
    private String dname;
    private String loc;
    private int num;
}
