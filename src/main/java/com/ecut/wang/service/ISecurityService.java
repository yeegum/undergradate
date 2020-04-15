package com.ecut.wang.service;

import com.ecut.wang.pojo.Security;
import com.ecut.wang.vo.Result;

public interface ISecurityService {
    Result likeSearchSecurity(Security security);
    Result insertNewSecurity(Security security);
}
