package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private String OwnerID;
    private String OwnerName;
    private String OwnerPwd;
    private int Sex;//1-男，0-女
    private String OwnerTel;
    private String HouseAddress;
    private int ResideMode;//0-租住。1-自住
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp EnterTime;//入住时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp EndTime;//结束时间
}
