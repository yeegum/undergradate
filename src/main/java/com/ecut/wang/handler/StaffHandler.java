package com.ecut.wang.handler;

import com.ecut.wang.pojo.Staff;
import com.ecut.wang.service.IStaffService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StaffHandler {
    @Autowired
    IStaffService staffService;

    @RequestMapping(value = "likeSearchStaff",method = RequestMethod.GET)
    public Result<Staff> likeSearchStaff(Staff staff){
        return staffService.likeSearchStaff(staff);
    }
    @RequestMapping(value = "getStaffByStaffID",method = RequestMethod.GET)
    public Result getStaffByStaffID(String StaffID){
        return staffService.getStaffByStaffID(StaffID);
    }
    @RequestMapping(value = "insertNewStaff",method = RequestMethod.GET)
    public Result insertNewStaff(Staff staff){
        return staffService.insertNewStaff(staff);
    }
    @RequestMapping(value = "updateStaff",method = RequestMethod.GET)
    public Result updateStaff(Staff staff){
        return staffService.updateStaff(staff);
    }
    @RequestMapping(value = "StaffLoginByStaffPwd",method = RequestMethod.GET)
    public Result StaffLoginByStaffPwd(Staff staff){
        return staffService.StaffLoginByStaffPwd(staff);
    }
}
