package com.ecut.wang.service;

import com.ecut.wang.pojo.House;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.vo.Result;


public interface IOwnerService {
    Result<Owner> getAllList();
    Result<Owner> likeSearchOwner(Owner owner);
    Result<Owner> getOwnerInfoById(String OwnerID);
    Result InsertNewOwner(Owner owner, House house);
    Result updateOwner(Owner owner,House house);
    Result loginByOwnerPwd(Owner owner);
    Result deleteOwner(String OwnerID);
}
