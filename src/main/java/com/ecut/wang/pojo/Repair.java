package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repair {
    private String ID;
    private String OwnerID;
    private String OwnerName;
    private String OwnerTel;
    private String HouseAddress;
    private String RepairContent;
    private int RepairState;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String RepairTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String RepairTime1;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String RepairTime2;
    private String StaffID;
    private String StaffName;
    private String StaffTel;
    private String RepairResult;
}
