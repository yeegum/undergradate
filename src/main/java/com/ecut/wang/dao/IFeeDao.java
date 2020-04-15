package com.ecut.wang.dao;

import com.ecut.wang.pojo.Fee;

import java.util.List;
public interface IFeeDao {
    List<Fee> likeSearchFee(Fee fee);
    int insertNewFee(Fee fee);
    int updateFee(Fee fee);
    Fee getFeeById(String FeeID);
}
