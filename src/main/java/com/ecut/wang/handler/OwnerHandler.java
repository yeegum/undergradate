package com.ecut.wang.handler;

import com.ecut.wang.pojo.House;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.service.IOwnerService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "http://wyj.yezijun.top",maxAge = 3600)
@RequestMapping("/api")
public class OwnerHandler {
    @Autowired
    IOwnerService ownerService;

    @RequestMapping(value = "likeSearchOwner",method = RequestMethod.GET)
    @ResponseBody
    public Result<Owner> likeSearchOwner(Owner owner) {
        Result<Owner> result = ownerService.likeSearchOwner(owner);
        return result;
    }

    @RequestMapping(value = "getOwnerInfoById",method = RequestMethod.GET)
    @ResponseBody
    public Result<Owner> getOwnerInfoById(String OwnerID) {
        Result<Owner> result = ownerService.getOwnerInfoById(OwnerID);
        return result;
    }

    @RequestMapping(value = "updateOwner",method = RequestMethod.GET)
    @ResponseBody
    public Result updateOwner(Owner owner,House house) {
        Result result = ownerService.updateOwner(owner,house);
        return result;
    }
    @RequestMapping(value = "InsertNewOwner",method = RequestMethod.GET)
    @ResponseBody
    public Result InsertNewOwner(Owner owner, House house){
        Result result =ownerService.InsertNewOwner(owner,house);
        return result;
    }
    @RequestMapping(value = "loginByOwnerPwd",method = RequestMethod.GET)
    @ResponseBody
    public Result loginByOwnerPwd(Owner owner){
        return ownerService.loginByOwnerPwd(owner);
    }
    @RequestMapping(value = "deleteOwner",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteOwner(String OwnerID){
        return ownerService.deleteOwner(OwnerID);
    }
}
