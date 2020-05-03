package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IOwnerDao;
import com.ecut.wang.pojo.House;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.service.IOwnerService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;


@Service
public class OwnerServiceImpl implements IOwnerService {
    @Autowired
    IOwnerDao ownerDao;

//    @Override
//    public Result<Owner> getAllList() {
//        Result result=new Result();
//        List<Owner> ownerList = ownerDao.getAllList();
//        if (!ownerList.isEmpty()){
//        result.setStatus(200);
//        result.setMsg("查询成功");
//        result.setData(ownerList);
//        }else {
//            result.setStatus(201);
//            result.setMsg("查询失败");
//            result.setData(ownerList);
//        }
//        return result;
//    }

    @Override
    public Result<Owner> getAllList() {
        return null;
    }

    @Override
    public Result<Owner> likeSearchOwner(Owner owner) {
//        Result result=new Result();
        List<Owner> ownerList = ownerDao.likeSearchOwner(owner);
        if (!ownerList.isEmpty()){
            return Result.SearchSuccess(ownerList);
        }else {
            return Result.SearchFail();
        }
    }

    @Override
    public Result<Owner> getOwnerInfoById(String OwnerID) {
//        Result result = new Result();
        if (OwnerID != null) {
            Owner owner = ownerDao.getOwnerInfoById(OwnerID);
//            result.setData(Result.SUCCESS_CODE);
//            result.setMsg("查询成功");
//            result.setData(owner);
            return Result.SearchSuccess(owner);
        }else {
//            result.setData(Result.FAIL_CODE);
//            result.setMsg("查询失败，用户ID不能为空");
            return Result.SearchFail();
        }
    }
    @Override
    public Result InsertNewOwner(Owner owner, House house) {
        String OwnerID = String.valueOf(System.currentTimeMillis()/1000);
        String HouseID = String.valueOf(System.currentTimeMillis()/1000);
        owner.setOwnerID(OwnerID);
        house.setHouseID(HouseID);
        house.setOwnerID(OwnerID);
        if (ownerDao.InsertNewOwner(owner)>=1&&ownerDao.InsertOwnerHouse(house)>=1){
            return Result.InsertSuccess();
        }else {
            return Result.InsertFail();
        }
    }

    @Override
    public Result updateOwner(Owner owner,House house) {
        if (ownerDao.updateOwner(owner)>=1&&ownerDao.updateOwnerHouse(house)>=1){
            return Result.UpdateSuccess();
        }else {
            return Result.UpdateFail();
        }
    }

    @Override
    public Result loginByOwnerPwd(Owner owner) {
        Owner ownerInfoById = ownerDao.getOwnerInfoById(owner.getOwnerID());
        if (ownerInfoById!=null){
            String Pwd= DigestUtils.md5DigestAsHex(owner.getOwnerPwd().getBytes());
            owner.setOwnerPwd(Pwd);
            Owner login = ownerDao.loginByOwnerPwd(owner);
            if (login!=null){
                return Result.LoginSuccess(login);
            }else {
                return Result.LoginFail();
            }
        }else {
            return Result.CheckFail();
        }
    }

    @Override
    public Result deleteOwner(String OwnerID) {
        int i = ownerDao.deleteOwner(OwnerID);
        if (i>=0){
            return Result.DeleteSuccess();
        }else {
            return Result.DeleteFail();
        }
    }
}
