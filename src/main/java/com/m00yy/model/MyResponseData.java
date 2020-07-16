package com.m00yy.model;

import java.util.List;

/**
 * 返回给前端的数据，用此类封装
 */
public class MyResponseData {
    private Integer error;
    private String status;
    private String msg;
    private Object obj;
    private List<?> list;

    public MyResponseData() {
    }

    public MyResponseData(Integer error, String status, String msg, Object obj, List<?> list) {
        this.error = error;
        this.status = status;
        this.msg = msg;
        this.obj = obj;
        this.list = list;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyResponseData{" +
                "error=" + error +
                ", status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                ", list=" + list +
                '}';
    }
}

