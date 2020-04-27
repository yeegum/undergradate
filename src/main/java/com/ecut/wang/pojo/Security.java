package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Security {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String Date;
    @JsonProperty("StaffID")
    private String StaffID;
    @JsonProperty("Period")
    private int Period;
    @JsonProperty("BuildingNumber")
    private String BuildingNumber;
    @JsonProperty("CheckMan")
    private String CheckMan;
    @JsonProperty("Population")
    private String Population;
    @JsonProperty("FireControl")
    private String FireControl;
    @JsonProperty("Lighting")
    private String Lighting;
    @JsonProperty("Security")
    private String Security;
    @JsonProperty("RescuePath")
    private String RescuePath;

}
