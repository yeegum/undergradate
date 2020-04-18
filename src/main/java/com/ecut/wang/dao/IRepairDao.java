package com.ecut.wang.dao;

import com.ecut.wang.pojo.Repair;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IRepairDao {
    List<Repair> likeSearchRepair(Repair repair);
    int insertNewRepair(Repair repair);
    int updateStaffRepair(Repair repair);
    int updateOwnerRepair(Repair repair);
    Repair getRepairById(String ID);
}
