package com.ecut.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Staff {
    private String StaffID;
    private String StaffName;
    private String StaffPwd;
    private int StaffSex;
    private String StaffTel;
    private String Role;
    private String DeptName;
}
