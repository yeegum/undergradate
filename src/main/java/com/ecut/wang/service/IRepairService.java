package com.ecut.wang.service;

import com.ecut.wang.pojo.Repair;
import com.ecut.wang.vo.Result;

public interface IRepairService {
    Result likeSearchRepair(Repair repair);
    Result insertNewRepair(Repair repair);
    Result updateStaffRepair(Repair repair);
    Result updateOwnerRepair(Repair repair);
    Result getRepairById(String ID);
}
