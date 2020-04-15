package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.ISecurityDao;
import com.ecut.wang.dao.IStaffDao;
import com.ecut.wang.pojo.Security;
import com.ecut.wang.pojo.Staff;
import com.ecut.wang.service.ISecurityService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SecurityServiceImpl implements ISecurityService {
    @Autowired
    ISecurityDao securityDao;
    @Autowired
    IStaffDao staffDao;
    @Override
    public Result likeSearchSecurity(Security security) {
        List<Security> securityList = securityDao.likeSearchSecurity(security);
        if (!securityList.isEmpty()){
            Result result = Result.SearchSuccess(securityList);
            return result;
        }else {
            Result result = Result.SearchFail();
            return result;
        }
    }

    @Override
    public Result insertNewSecurity(Security security) {
        Staff staff = staffDao.getStaffByStaffID(security.getStaffID());
        security.setCheckMan(staff.getStaffName());
        security.setID(String.valueOf(System.currentTimeMillis()/1000));
        int i = securityDao.insertNewSecurity(security);
        if (i>=1){
            Result result = Result.InsertSuccess();
            return result;
        }else {
            Result result = Result.InsertFail();
            return result;
        }
    }
}
