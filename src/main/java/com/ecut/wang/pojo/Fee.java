package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fee {
    @JsonProperty("FeeID")
    private String FeeID;
    @JsonProperty("OwnerID")
    private String OwnerID;
    @JsonProperty("OwnerTel")
    private String OwnerTel;
    @JsonProperty("HouseAddress")
    private String HouseAddress;
    @JsonProperty("OwnerName")
    private String OwnerName;
    @JsonProperty("FeeTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String FeeTime;
    @JsonProperty("StaffID")
    private String StaffID;
    @JsonProperty("PayTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String PayTime;
    @JsonProperty("WaterFee")
    private int WaterFee;
    @JsonProperty("ElectricFee")
    private int ElectricFee;
    @JsonProperty("PropertyFee")
    private int PropertyFee;
    @JsonProperty("TotalCost")
    private int TotalCost;
    @JsonProperty("IsPay")
    private int IsPay;
    @JsonProperty("LateFee")
    private int LateFee;
    @JsonProperty("CarFee")
    private int CarFee;
}
