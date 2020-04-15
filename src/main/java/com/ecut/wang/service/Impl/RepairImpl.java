package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IOwnerDao;
import com.ecut.wang.dao.IRepairDao;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.pojo.Repair;
import com.ecut.wang.service.IRepairService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairImpl implements IRepairService {
    @Autowired
    IRepairDao repairDao;
    @Autowired
    IOwnerDao ownerDao;
    @Override
    public Result likeSearchRepair(Repair repair) {
        List<Repair> repairList = repairDao.likeSearchRepair(repair);
        if (repairList!=null){
            return Result.SearchSuccess(repairList);
        }else {
            return Result.SearchFail();
        }
    }


    @Override
    public Result insertNewRepair(Repair repair) {
        repair.setID(String.valueOf(System.currentTimeMillis()/1000));
        Owner owner = ownerDao.getOwnerByHouseAddress(repair.getHouseAddress());
        repair.setOwnerID(owner.getOwnerID());
        repair.setRepairTime(String.valueOf(System.currentTimeMillis()/1000));
        int i = repairDao.insertNewRepair(repair);
        if (i>=1){
            return Result.InsertSuccess();
        }else {
            return Result.InsertFail();
        }
    }

    @Override
    public Result updateStaffRepair(Repair repair) {
        int i = repairDao.updateStaffRepair(repair);
        if (i>=1){
            return Result.UpdateSuccess();
        }else {
            return Result.UpdateFail();
        }
    }

    @Override
    public Result updateOwnerRepair(Repair repair) {
        int i = repairDao.updateOwnerRepair(repair);
        if (i>=1){
            return Result.UpdateSuccess();
        }else {
            return Result.UpdateFail();
        }
    }

    @Override
    public Result getRepairById(String ID) {
        Repair repair = repairDao.getRepairById(ID);
        if (repair!=null){
            return Result.SearchSuccess(repair);
        }else {
            return Result.SearchFail();
        }
    }
}
