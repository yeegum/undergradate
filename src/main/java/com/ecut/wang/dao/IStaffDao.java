package com.ecut.wang.dao;

import com.ecut.wang.pojo.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStaffDao {
    List<Staff> likeSearchStaff(Staff staff);
    Staff getStaffByStaffID(String StaffID);
    int insertNewStaff(Staff staff);
    int updateStaff(Staff staff);
    Staff StaffLoginByStaffPwd(Staff staff);
}
