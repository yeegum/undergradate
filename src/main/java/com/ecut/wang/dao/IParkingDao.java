package com.ecut.wang.dao;

import com.ecut.wang.pojo.Owner;
import com.ecut.wang.pojo.Parking;

import java.util.List;

public interface IParkingDao {
    List<Parking> likeSearchParking(Parking parking);
    int insertNewParking(Parking parking);
    int updateParking(Parking parking);
    Parking getParkingById(String ID);
    Owner getOwnerByCarID(String CarID);
}
