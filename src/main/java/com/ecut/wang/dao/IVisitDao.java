package com.ecut.wang.dao;

import com.ecut.wang.pojo.Visit;

import java.util.List;

public interface IVisitDao {
    List<Visit> likeSearchVisit(Visit visit);
    int insertNewVisit(Visit visit);
    int updateVisit(Visit visit);
    Visit getVisitById(String ID);
}
