package com.ecut.wang.dao;

import com.ecut.wang.pojo.Owner;
import com.ecut.wang.pojo.Parking;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IParkingDao {
    List<Parking> likeSearchParking(Parking parking);
    int insertNewParking(Parking parking);
    int updateParking(Parking parking);
    Parking getParkingById(String ID);
    Owner getOwnerByCarID(String CarID);
}
