package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IOwnerDao;
import com.ecut.wang.dao.IParkingDao;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.pojo.Parking;
import com.ecut.wang.service.IParkingService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkingServiceImpl implements IParkingService {
    @Autowired
    IParkingDao parkingDao;

    @Override
    public Result likeSearchParking(Parking parking) {
        Result result=new Result();
        List<Parking> parkingList = parkingDao.likeSearchParking(parking);
        if (!parkingList.isEmpty()){
            result.setStatus(Result.SUCCESS_CODE);
            result.setMsg("查询成功");
            result.setData(parkingList);
        }else {
            result.setStatus(Result.FAIL_CODE);
            result.setMsg("查询失败");
        }
        return result;
    }

    @Override
        public Result insertNewParking(Parking parking) {
        Result result=new Result();
        String ID = String.valueOf(System.currentTimeMillis()/1000);
        parking.setID(ID);
        Owner owner = parkingDao.getOwnerByCarID(parking.getCarID());
        if (owner!=null){
            parking.setCarKind(0);
            int i = parkingDao.insertNewParking(parking);
            if (i>=1){
                result.setStatus(Result.SUCCESS_CODE);
                result.setMsg("新增成功");
            }else {
                result.setStatus(Result.FAIL_CODE);
                result.setMsg("新增失败");
            }
        }else {
            parking.setCarKind(1);
            int i = parkingDao.insertNewParking(parking);
            if (i>=1){
                result.setStatus(Result.SUCCESS_CODE);
                result.setMsg("新增成功");
            }else {
                result.setStatus(Result.FAIL_CODE);
                result.setMsg("新增失败");
            }
        }

        return result;
    }

    @Override
    public Result updateParking(Parking parking) {
        Result result=new Result();
        int i = parkingDao.updateParking(parking);
        if (i>=1){
            result.setStatus(Result.SUCCESS_CODE);
            result.setMsg("修改成功");
        }else {
            result.setStatus(Result.FAIL_CODE);
            result.setMsg("修改失败");
        }
        return result;
    }

    @Override
    public Result getParkingById(String ID) {
        Result result=new Result();
        if (ID!=null){
            Parking parking = parkingDao.getParkingById(ID);
            result.setStatus(Result.SUCCESS_CODE);
            result.setMsg("查询成功");
            result.setData(parking);
        }else {
            result.setStatus(Result.FAIL_CODE);
            result.setMsg("查询失败");
        }
        return result;
    }
}
