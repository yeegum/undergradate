package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IFeeDao;
import com.ecut.wang.dao.IOwnerDao;
import com.ecut.wang.pojo.Fee;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.service.IFeeService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeServiceImpl implements IFeeService {
    @Autowired
    IFeeDao feeDao;
    @Autowired
    IOwnerDao ownerDao;
    @Override
    public Result<List<Fee>> likeSearchFee(Fee fee) {
        List<Fee> feeList = feeDao.likeSearchFee(fee);
        if (feeList!=null){
           return Result.SearchSuccess(feeList);
        }else {
            return Result.SearchFail();
        }
    }
    public Result insertNewFee(Fee fee){
        fee.setFeeID(String.valueOf(System.currentTimeMillis()/1000));
        Owner owner = ownerDao.getOwnerByHouseAddress(fee.getHouseAddress());
        fee.setOwnerID(owner.getOwnerID());
        int i = feeDao.insertNewFee(fee);
        if (i>=1){
            return Result.InsertSuccess();
        }else {
            return Result.InsertFail();
        }
    }

    @Override
    public Result updateFee(Fee fee) {
        fee.setPayTime(String.valueOf(System.currentTimeMillis()/1000));
        int i = feeDao.updateFee(fee);
        if (i>=1){
            return Result.UpdateSuccess();
        }else {
            return Result.UpdateFail();
        }
    }

    @Override
    public Result getFeeById(String FeeID) {
        Fee fee = feeDao.getFeeById(FeeID);
        if (fee!=null){
            return Result.SearchSuccess(fee);
        }else {
            return Result.SearchFail();
        }
    }
}
