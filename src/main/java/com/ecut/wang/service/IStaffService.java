package com.ecut.wang.service;

import com.ecut.wang.pojo.Staff;
import com.ecut.wang.vo.Result;

public interface IStaffService {
    Result<Staff> likeSearchStaff(Staff staff);
    Result<Staff> getStaffByStaffID(String StaffID);
    Result insertNewStaff(Staff staff);
    Result updateStaff(Staff staff);
    Result StaffLoginByStaffPwd(Staff staff);
}
