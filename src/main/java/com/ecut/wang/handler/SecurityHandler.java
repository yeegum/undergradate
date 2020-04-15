package com.ecut.wang.handler;

import com.ecut.wang.pojo.Security;
import com.ecut.wang.service.ISecurityService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityHandler {
    @Autowired
    ISecurityService securityService;
    @RequestMapping(value = "likeSearchSecurity",method = RequestMethod.GET)
    public Result likeSearchSecurity(Security  security){
        return securityService.likeSearchSecurity(security);
    }
    @RequestMapping(value = "insertNewSecurity",method = RequestMethod.GET)
    public Result insertNewSecurity(Security security){
        return securityService.insertNewSecurity(security);
    }
}
