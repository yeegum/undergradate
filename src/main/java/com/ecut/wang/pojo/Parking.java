package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parking {
    @JsonProperty("ID")
    private String ID;//序号
    @JsonProperty("CarID")
    private String CarID;//车牌号
    @JsonProperty("OwnerName")
    private String OwnerName;//住户姓名
    @JsonProperty("EnterTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime;//入场时间
    @JsonProperty("EnterTime1")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime1;//入场时间1
    @JsonProperty("EnterTime2")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime2;//入场时间2
    @JsonProperty("OutTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String OutTime;//出场时间
    @JsonProperty("OutTime1")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String OutTime1;//出场时间1
    @JsonProperty("OutTime2")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String OutTime2;//出场时间2
    @JsonProperty("CarKind")
    private int CarKind;//车辆类型
    @JsonProperty("PayWay")
    private int PayWay;//支付方式
    @JsonProperty("CarFee")
    private int CarFee;//金额
}
