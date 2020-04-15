package com.ecut.wang.service.Impl;

import com.ecut.wang.dao.IOwnerDao;
import com.ecut.wang.dao.IVisitDao;
import com.ecut.wang.pojo.Owner;
import com.ecut.wang.pojo.Visit;
import com.ecut.wang.service.IVisitService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitServiceImpl implements IVisitService {
    @Autowired
    IVisitDao visitDao;
    @Autowired
    IOwnerDao ownerDao;
    @Override
    public Result likeSearchVisit(Visit visit) {
        List<Visit> visitList = visitDao.likeSearchVisit(visit);
        if (visitList!=null){
            return Result.SearchSuccess(visitList);
        }else {
            return Result.SearchFail();
        }
    }


    @Override
    public Result insertNewVisit(Visit visit) {
        visit.setID(String.valueOf(System.currentTimeMillis()/1000));
        Owner owner = ownerDao.getOwnerByHouseAddress(visit.getHouseAddress());
        visit.setOwnerID(owner.getOwnerID());
        int i = visitDao.insertNewVisit(visit);
        if (i>=1){
            return Result.InsertSuccess();
        }else {
            return Result.InsertFail();
        }
    }

    @Override
    public Result updateVisit(Visit visit) {
        int i = visitDao.updateVisit(visit);
        if (i>=1){
            return Result.UpdateSuccess();
        }else {
            return Result.UpdateFail();
        }
    }

    @Override
    public Result getVisitById(String ID) {
        Visit visit = visitDao.getVisitById(ID);
        if (visit!=null){
            return Result.SearchSuccess(visit);
        }else {
            return Result.SearchFail();
        }
    }
}
