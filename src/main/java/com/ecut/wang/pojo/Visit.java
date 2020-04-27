package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visit {
   @JsonProperty("ID")
   private String ID;
   @JsonProperty("Visitor")
   private String Visitor;
   @JsonProperty("Sex")
   private int Sex;
   @JsonProperty("Tel")
   private String Tel;
   @JsonProperty("OwnerID")
   private String OwnerID;
   @JsonProperty("OwnerName")
   private String OwnerName;
   @JsonProperty("HouseAddress")
   private String HouseAddress;
   @JsonProperty("ComeTime")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String ComeTime;
   @JsonProperty("ComeTime1")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String ComeTime1;
   @JsonProperty("ComeTime2")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String ComeTime2;
   @JsonProperty("LeftTime")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String LeftTime;
   @JsonProperty("LeftTime1")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String LeftTime1;
   @JsonProperty("LeftTime2")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String LeftTime2;
   @JsonProperty("StaffID")
   private String StaffID;
   @JsonProperty("StaffName")
   private String StaffName;

}
