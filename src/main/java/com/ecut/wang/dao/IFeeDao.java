package com.ecut.wang.dao;

import com.ecut.wang.pojo.Fee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IFeeDao {
    List<Fee> likeSearchFee(Fee fee);
    int insertNewFee(Fee fee);
    int updateFee(Fee fee);
    Fee getFeeById(String FeeID);
}
