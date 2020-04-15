package com.ecut.wang.handler;

import com.ecut.wang.pojo.Visit;
import com.ecut.wang.service.IVisitService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VisitHandler {
    @Autowired
    IVisitService visitService;

    @RequestMapping(value = "likeSearchVisit",method = RequestMethod.GET)
    public Result likeSearchVisit(Visit visit){
        return visitService.likeSearchVisit(visit);
    }
    @RequestMapping(value = "insertNewVisit",method = RequestMethod.GET)
    public Result insertNewVisit(Visit visit){
        return visitService.insertNewVisit(visit);
    }
    @RequestMapping(value = "updateVisit",method = RequestMethod.GET)
    public Result updateVisit(Visit visit){
        return visitService.insertNewVisit(visit);
    }
    @RequestMapping(value = "getVisitById",method = RequestMethod.GET)
    public Result getVisitById(String ID){
        return visitService.getVisitById(ID);
    }
}
