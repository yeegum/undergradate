package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    @JsonProperty("HouseID")
    private String HouseID;
    @JsonProperty("OwnerID")
    private String OwnerID;
    @JsonProperty("HouseAddress")
    private String HouseAddress;//住址
    @JsonProperty("HouseArea")
    private int HouseArea;//住宅面积
}
