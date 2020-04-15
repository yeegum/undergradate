package com.ecut.wang.dao;

import com.ecut.wang.pojo.House;
import com.ecut.wang.pojo.Owner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOwnerDao {
     List<Owner> getAllList();
     List<Owner> likeSearchOwner(Owner owner);
     Owner getOwnerInfoById(String OwnerID);
     Integer InsertNewOwner(Owner owner);
     Integer updateOwner(Owner owner);
     Integer InsertOwnerHouse(House house);
     Integer updateOwnerHouse(House house);
     Owner getOwnerByHouseAddress(String HouserAddress);
}
