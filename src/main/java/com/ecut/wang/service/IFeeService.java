package com.ecut.wang.service;

import com.ecut.wang.pojo.Fee;
import com.ecut.wang.vo.Result;

import java.util.List;

public interface IFeeService {
 Result<List<Fee>> likeSearchFee(Fee fee);
 Result insertNewFee(Fee fee);
 Result updateFee(Fee fee);
 Result getFeeById(String FeeID);
}
