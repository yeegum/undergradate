package com.ecut.wang.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    public static final int FAIL_CODE=201;
    public static final int SUCCESS_CODE=200;
    public static final String FAIL_MSG="调用失败";
    public static final String SUCCESS_MSG="调用成功";
    private Integer code;
    private String msg;
    private T data;

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMsg(SUCCESS_MSG);
        result.setData(object);
        return result;
    }
}
