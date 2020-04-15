package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visit {
   private String ID;
   private String Visitor;
   private int Sex;
   private String Tel;
   private String OwnerID;

   private String OwnerName;
   private String HouseAddress;
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String ComeTime;
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String ComeTime1;
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String ComeTime2;
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String LeftTime;
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String LeftTime1;
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private String LeftTime2;
   private String StaffID;
   private String StaffName;

}
