package com.ecut.wang.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    public static final int SUCCESS_CODE = 1;
    public static final int FAIL_CODE = 0;
    public static final String SEARCH_FAIL_MSG = "查询失败";
    public static final String SEARCH_SUCCESS_MSG = "查询成功";
    public static final String INSERT_FAIL_MSG = "新增失败";
    public static final String INSERT_SUCCESS_MSG = "新增成功";
    public static final String DELETE_FAIL_MSG = "删除失败";
    public static final String DELETE_SUCCESS_MSG = "删除成功";
    public static final String UPDATE_FAIL_MSG = "更改失败";
    public static final String UPDATE_SUCCESS_MSG = "更改成功";
    public static final String LOGIN_SUCCESS_MSG = "身份验证成功";
    public static final String LOGIN_FAIL_MSG = "身份验证失败";
    public static final String CHECK_FAIL_MSG = "查无此人";
//    public static final String CHECK_SUCCESS_MSG = "查询成功";
    private Integer status;
    private String msg;
    private T data;

    public static Result SearchSuccess(Object object) {
        Result result = new Result();
        result.setStatus(SUCCESS_CODE);
        result.setMsg(SEARCH_SUCCESS_MSG);
        result.setData(object);
        return result;
    }

    public static Result SearchFail() {
        Result result = new Result();
        result.setStatus(FAIL_CODE);
        result.setMsg(SEARCH_FAIL_MSG);
        return result;
    }

    public static Result InsertSuccess() {
        Result result = new Result();
        result.setStatus(SUCCESS_CODE);
        result.setMsg(INSERT_SUCCESS_MSG);
        return result;
    }

    public static Result InsertFail() {
        Result result = new Result();
        result.setStatus(FAIL_CODE);
        result.setMsg(INSERT_FAIL_MSG);
        return result;
    }

    public static Result UpdateSuccess() {
        Result result = new Result();
        result.setStatus(SUCCESS_CODE);
        result.setMsg(UPDATE_SUCCESS_MSG);
        return result;
    }

    public static Result UpdateFail() {
        Result result = new Result();
        result.setStatus(FAIL_CODE);
        result.setMsg(UPDATE_FAIL_MSG);
        return result;
    }
    public static Result LoginFail() {
        Result result = new Result();
        result.setStatus(FAIL_CODE);
        result.setMsg(LOGIN_FAIL_MSG);
        return result;
    }
    public static Result LoginSuccess(Object object) {
        Result result = new Result();
        result.setStatus(SUCCESS_CODE);
        result.setMsg(LOGIN_SUCCESS_MSG);
        result.setData(object);
        return result;
    }
    public static Result CheckFail() {
        Result result = new Result();
        result.setStatus(FAIL_CODE);
        result.setMsg(CHECK_FAIL_MSG);
        return result;
    }
    public static Result DeleteSuccess() {
        Result result = new Result();
        result.setStatus(SUCCESS_CODE);
        result.setMsg(DELETE_SUCCESS_MSG);
        return result;
    }

    public static Result DeleteFail() {
        Result result = new Result();
        result.setStatus(FAIL_CODE);
        result.setMsg(DELETE_FAIL_MSG);
        return result;
    }
}
