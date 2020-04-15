package com.ecut.wang.dao;

import com.ecut.wang.pojo.Security;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ISecurityDao {
    List<Security> likeSearchSecurity(Security security);
    int insertNewSecurity(Security security);//ID,StaffID,CheckMan字段都没有
}
