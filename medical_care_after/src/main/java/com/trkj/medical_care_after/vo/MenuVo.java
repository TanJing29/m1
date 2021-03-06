package com.trkj.medical_care_after.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVo {
    private int id;
    private int menuPid;
    private String menuPids;
    private byte isLeaf;
    private String menuName;
    private String url;
    private String icon;
    private String iconColor;
    private Byte sort;
    private byte level;
    private byte status;
}
