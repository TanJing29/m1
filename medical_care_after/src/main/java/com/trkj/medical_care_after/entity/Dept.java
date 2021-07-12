package com.trkj.medical_care_after.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * dept
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Integer deptno;

    private String dname;

    private String loc;

    private static final long serialVersionUID = 1L;
}