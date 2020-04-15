package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private String OwnerID;//住户ID
    private String OwnerName;//住户名字
    private String OwnerPwd;//住户密码
    private int Sex;//1-男，0-女
    private String CarID;//住户车牌
    private String OwnerTel;//住户电话
    private String HouseAddress;//住户地址
    private int ResideMode;//0-租住。1-自住
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime;//入住时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EndTime;//结束时间
}
