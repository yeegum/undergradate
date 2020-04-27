package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @JsonProperty("OwnerID")
    private String OwnerID;//住户ID
    @JsonProperty("OwnerName")
    private String OwnerName;//住户名字
    @JsonProperty("OwnerPwd")
    private String OwnerPwd;//住户密码
    @JsonProperty("Sex")
    private int Sex;//1-男，0-女
    @JsonProperty("CarID")
    private String CarID;//住户车牌
    @JsonProperty("OwnerTel")
    private String OwnerTel;//住户电话
    @JsonProperty("HouseAddress")
    private String HouseAddress;//住户地址
    @JsonProperty("ResideMode")
    private int ResideMode;//0-租住。1-自住
    @JsonProperty("EnterTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EnterTime;//入住时间
    @JsonProperty("EndTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String EndTime;//结束时间
}
