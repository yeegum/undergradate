package com.ecut.wang.dao;

import com.ecut.wang.pojo.Visit;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IVisitDao {
    List<Visit> likeSearchVisit(Visit visit);
    int insertNewVisit(Visit visit);
    int updateVisit(Visit visit);
    Visit getVisitById(String ID);
}
