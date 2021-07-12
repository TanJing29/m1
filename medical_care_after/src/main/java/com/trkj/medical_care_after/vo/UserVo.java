package com.trkj.medical_care_after.vo;

import com.trkj.medical_care_after.entity.SysMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    private int id;
    private String username;
    private String password;
    private String token;
    private boolean isValidate;
    private List<SysMenu> menus;
}
