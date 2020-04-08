package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IOwnerDao;
import com.ecut.wang.pojo.House;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.service.IOwnerService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;

import java.util.List;
import java.util.UUID;

@Service
public class OwnerServiceImpl implements IOwnerService {
    @Autowired
    IOwnerDao ownerDao;

    @Override
    public Result<Owner> getAllList() {
        Result result=new Result();
        List<Owner> ownerList = ownerDao.getAllList();
        if (!ownerList.isEmpty()){
        result.setCode(200);
        result.setMsg("查询成功");
        result.setData(ownerList);
        }else {
            result.setCode(200);
            result.setMsg("查询成功");
            result.setData(ownerList);
        }
        return result;
    }

    @Override
    public Result<Owner> likeSearchOwner(Owner owner) {
        Result result=new Result();
        List<Owner> ownerList = ownerDao.likeSearchOwner(owner);
        if (!ownerList.isEmpty()){
            result.setCode(Result.SUCCESS_CODE);
            result.setMsg("查询成功");
            result.setData(ownerList);
        }else {
            result.setCode(Result.FAIL_CODE);
            result.setMsg("查询为空");
        }
        return result;
    }

    @Override
    public Result<Owner> getOwnerInfoById(String OwnerID) {
        Result result = new Result();

        if (OwnerID != null) {
            Owner owner = ownerDao.getOwnerInfoById(OwnerID);
            result.setCode(Result.SUCCESS_CODE);
            result.setMsg("查询成功");
            result.setData(owner);
        }else {
            result.setCode(Result.FAIL_CODE);
            result.setMsg("查询失败，用户ID不能为空");
        }
        return result;
    }
    @Override
    public Result InsertNewOwner(Owner owner, House house) {
        Result result=new Result();
        String OwnerID = String.valueOf(System.currentTimeMillis()/1000);
        String HouseID = String.valueOf(System.currentTimeMillis()/1000);
        owner.setOwnerID(OwnerID);
        house.setHouseID(HouseID);
        house.setOwnerID(OwnerID);
        if (ownerDao.InsertNewOwner(owner)!=-1&&ownerDao.InsertOwnerHouse(house)!=-1){
            result.setCode(Result.SUCCESS_CODE);
            result.setMsg("新增成功");
        }else {
            result.setCode(Result.FAIL_CODE);
            result.setMsg("新增失败");
        }
        return result;
    }

    @Override
    public Result updateOwner(Owner owner) {
        Result result=new Result();
        if (ownerDao.updateOwner(owner)!=null){
            result.setCode(Result.SUCCESS_CODE);
            result.setMsg("更改成功！");
        }else {
            result.setCode(Result.SUCCESS_CODE);
            result.setMsg("更改失败");
        }
        return result;
    }
}
