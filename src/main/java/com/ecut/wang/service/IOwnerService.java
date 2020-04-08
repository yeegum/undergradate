package com.ecut.wang.service;

import com.ecut.wang.pojo.Owner;
import com.ecut.wang.vo.Result;

import java.util.List;

public interface IOwnerService {
    Result<Owner> getAllList();
    Result<Owner> likeSearchOwner(Owner owner);
    Result<Owner> getOwnerInfoById(String OwnerID);
    Result InsertNewOwner(Owner owner);
    Result updateOwner(Owner owner);
}
