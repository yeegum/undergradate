package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Staff {
    @JsonProperty("StaffID")
    private String StaffID;
    @JsonProperty("StaffName")
    private String StaffName;
    @JsonProperty("StaffPwd")
    private String StaffPwd;
    @JsonProperty("StaffSex")
    private int StaffSex;
    @JsonProperty("StaffTel")
    private String StaffTel;
    @JsonProperty("Role")
    private String Role;
    @JsonProperty("DeptName")
    private String DeptName;
}
