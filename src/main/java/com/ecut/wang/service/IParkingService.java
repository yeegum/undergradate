package com.ecut.wang.service;

import com.ecut.wang.pojo.Parking;
import com.ecut.wang.vo.Result;

import java.util.List;

public interface IParkingService {
    Result likeSearchParking(Parking parking);
    Result insertNewParking(Parking parking);
    Result updateParking(Parking parking);
    Result getParkingById(String ID);
}
