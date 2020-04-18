package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IStaffDao;
import com.ecut.wang.pojo.Staff;
import com.ecut.wang.service.IStaffService;
import com.ecut.wang.vo.Result;
import com.github.pagehelper.util.StringUtil;
import com.sun.tools.javac.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class StaffServiceImpl implements IStaffService {
    @Autowired
    IStaffDao staffDao;

    @Override
    public Result<Staff> likeSearchStaff(Staff staff) {
        List<Staff> staffList = staffDao.likeSearchStaff(staff);
        if (!staffList.isEmpty()){
            Result result = Result.SearchSuccess(staffList);
            return result;
        }else {
            Result result = Result.SearchFail();
            return result;
        }
    }

    @Override
    public Result<Staff> getStaffByStaffID(String StaffID) {
        if (StaffID!=null&&StaffID!=""){
            Staff staff = staffDao.getStaffByStaffID(StaffID);
            if (staff!=null){
                return Result.SearchSuccess(staff);
            }else {
                return Result.SearchFail();
            }
        }else {
            return Result.SearchFail();
        }
    }

    @Override
    public Result insertNewStaff(Staff staff) {
        String newStaffPwd= DigestUtils.md5DigestAsHex(staff.getStaffPwd().getBytes());
        staff.setStaffPwd(newStaffPwd);
        staff.setStaffID(String.valueOf(System.currentTimeMillis()/1000));
        int i = staffDao.insertNewStaff(staff);
        if (i>=1){
            return Result.InsertSuccess();
        }else {
            return Result.InsertFail();
        }
    }

    @Override
    public Result updateStaff(Staff staff) {
        String newStaffPwd= DigestUtils.md5DigestAsHex(staff.getStaffPwd().getBytes());
        staff.setStaffPwd(newStaffPwd);
        int i = staffDao.updateStaff(staff);
        if (i>=1){
            return Result.UpdateSuccess();
        }else {
            return Result.UpdateFail();
        }
    }

    @Override
    public Result StaffLoginByStaffPwd(Staff staff) {
        Staff staff1 = staffDao.getStaffByStaffID(staff.getStaffID());
        if (staff1!=null){
            Staff staff2 = staffDao.StaffLoginByStaffPwd(staff);
            if (staff2!=null){
                return Result.LoginSuccess();
            }else {
                return Result.LoginFail();
            }
        }else {
            return Result.CheckFail();
        }
    }
}
