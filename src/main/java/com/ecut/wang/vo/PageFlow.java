package com.ecut.wang.vo;

import java.util.List;

public class PageFlow<T> {
    private int code;

    private String msg;

    private long count;

    private List<T> data;
    private int pages;
    public PageFlow() {
    }
    public PageFlow(int code, String msg, long count,int pages) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.pages=pages;
    }
    public int getPages(){return pages;}
    public void setPages(int pages){this.pages=pages;}
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
