package com.ecut.wang.handler;

import com.ecut.wang.pojo.Fee;
import com.ecut.wang.service.IFeeService;
import com.ecut.wang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FeeHandler {
    @Autowired
    IFeeService feeService;

    @RequestMapping(value = "likeSearchFee",method = RequestMethod.GET)
    public Result<List<Fee>> likeSearchFee(Fee fee){
        return feeService.likeSearchFee(fee);
    }
    @RequestMapping(value = "insertNewFee",method = RequestMethod.GET)
    public Result insertNewFee(Fee fee){
        return feeService.insertNewFee(fee);
    }
    @RequestMapping(value = "updateFee",method = RequestMethod.GET)
    public Result updateFee(Fee fee){
        return feeService.updateFee(fee);
    }
    @RequestMapping(value = "getFeeById",method = RequestMethod.GET)
    public Result getFeeById(String FeeID){
        return feeService.getFeeById(FeeID);
    }
}
