package com.ecut.wang.service;

import com.ecut.wang.pojo.Visit;
import com.ecut.wang.vo.Result;

public interface IVisitService {
    Result likeSearchVisit(Visit visit);
    Result insertNewVisit(Visit visit);
    Result updateVisit(Visit visit);
    Result getVisitById(String ID);
}
