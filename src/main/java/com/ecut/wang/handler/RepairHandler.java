package com.ecut.wang.handler;

import com.ecut.wang.pojo.Repair;
import com.ecut.wang.service.IRepairService;
import com.ecut.wang.service.Impl.RepairImpl;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RepairHandler {
    @Autowired
    IRepairService repairService;

    @RequestMapping(value = "likeSearchRepair",method = RequestMethod.GET)
    public Result likeSearchRepair(Repair repair){
        return repairService.likeSearchRepair(repair);
    }
    @RequestMapping(value = "insertNewRepair",method = RequestMethod.GET)
    public Result insertNewRepair(Repair repair){
        return repairService.insertNewRepair(repair);
    }
    @RequestMapping(value = "updateStaffRepair",method = RequestMethod.GET)
    public Result updateStaffRepair(Repair repair){
        return repairService.updateStaffRepair(repair);
    }
    @RequestMapping(value = "updateOwnerRepair",method = RequestMethod.GET)
    public Result updateOwnerRepair(Repair repair){
        return repairService.updateOwnerRepair(repair);
    }
    @RequestMapping(value = "getRepairById",method = RequestMethod.GET)
    public Result getRepairById(String ID){
        return repairService.getRepairById(ID);
    }
}
