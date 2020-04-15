package com.ecut.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fee {
    private String FeeID;
    private String OwnerID;
    private String OwnerTel;
    private String HouseAddress;
    private String OwnerName;
    private String FeeTime;
    private String StaffID;
    private String PayTime;
    private int WaterFee;
    private int ElectricFee;
    private int PropertyFee;
    private int TotalCost;
    private int IsPay;
    private int LateFee;
    private int CarFee;
}
