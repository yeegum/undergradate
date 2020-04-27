package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repair {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("OwnerID")
    private String OwnerID;
    @JsonProperty("OwnerName")
    private String OwnerName;
    @JsonProperty("OwnerTel")
    private String OwnerTel;
    @JsonProperty("HouseAddress")
    private String HouseAddress;
    @JsonProperty("RepairContent")
    private String RepairContent;
    @JsonProperty("RepairState")
    private int RepairState;
    @JsonProperty("RepairTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String RepairTime;
    @JsonProperty("RepairTime1")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String RepairTime1;
    @JsonProperty("RepairTime2")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String RepairTime2;
    @JsonProperty("StaffID")
    private String StaffID;
    @JsonProperty("StaffName")
    private String StaffName;
    @JsonProperty("StaffTel")
    private String StaffTel;
    @JsonProperty("RepairResult")
    private String RepairResult;
}
