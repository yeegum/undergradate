package com.ecut.wang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Security {
    private String ID;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String Date;
    private String StaffID;
    private int Period;
    private String BuildingNumber;
    private String CheckMan;
    private String Population;
    private String FireControl;
    private String Lighting;
    private String Security;
    private String RescuePath;
}
