package com.ecut.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    private String HouseID;
    private String OwnerID;
    private String HouseAddress;
    private int HouseArea;
}
