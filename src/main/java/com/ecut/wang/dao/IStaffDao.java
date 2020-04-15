package com.ecut.wang.dao;

import com.ecut.wang.pojo.Staff;

import java.util.List;

public interface IStaffDao {
    List<Staff> likeSearchStaff(Staff staff);
    Staff getStaffByStaffID(String StaffID);
    int insertNewStaff(Staff staff);
    int updateStaff(Staff staff);
}
