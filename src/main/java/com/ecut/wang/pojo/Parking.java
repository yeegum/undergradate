package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parking {
    private String ID;//序号
    private String CarID;//车牌号
    private String OwnerName;//住户姓名
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime;//入场时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime1;//入场时间1
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime2;//入场时间2
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String OutTime;//出场时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String OutTime1;//出场时间1
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String OutTime2;//出场时间2
    private int CarKind;//车辆类型
    private int PayWay;//支付方式
    private int CarFee;//金额
}
