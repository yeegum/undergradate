package com.ecut.wang.handler;

import com.ecut.wang.pojo.Owner;
import com.ecut.wang.service.IOwnerService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class OwnerHandler {
    @Autowired
    IOwnerService ownerService;

    @RequestMapping("getAllOwnerList")
    @ResponseBody
    public Result<Owner> getAllOwnerList() {
        Result<Owner> result = ownerService.getAllList();
        return result;
    }

    @RequestMapping("likeSearchOwner")
    @ResponseBody
    public Result<Owner> likeSearchOwner(Owner owner) {
        Result<Owner> result = ownerService.likeSearchOwner(owner);
        return result;
    }

    @RequestMapping("getOwnerInfoById")
    @ResponseBody
    public Result<Owner> getOwnerInfoById(String OwnerID) {
        Result<Owner> result = ownerService.getOwnerInfoById(OwnerID);
        return result;
    }

    @RequestMapping("updateOwner")
    @ResponseBody
    public Result updateOwner(Owner owner) {
        Result result = ownerService.updateOwner(owner);
        return result;
    }
}
