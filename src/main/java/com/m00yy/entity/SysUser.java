package com.m00yy.entity;

import java.io.Serializable;

/**
 * 实体类，对应一张数据表
 * 1.实现序列化接口
 * 2.构造空构造方和和全属性构造方法
 * 3.生成getset方法组
 * 4.生成toString方法
 */
public class SysUser implements Serializable {
    private String t_user_id;
    private String t_user_name;
    private String t_user_pwd;
    private String t_role;
    private String t_status;

    public SysUser() {
    }

    public SysUser(String t_user_id, String t_user_name, String t_user_pwd, String t_role, String t_status) {
        this.t_user_id = t_user_id;
        this.t_user_name = t_user_name;
        this.t_user_pwd = t_user_pwd;
        this.t_role = t_role;
        this.t_status = t_status;
    }

    public String getT_user_id() {
        return t_user_id;
    }

    public void setT_user_id(String t_user_id) {
        this.t_user_id = t_user_id;
    }

    public String getT_user_name() {
        return t_user_name;
    }

    public void setT_user_name(String t_user_name) {
        this.t_user_name = t_user_name;
    }

    public String getT_user_pwd() {
        return t_user_pwd;
    }

    public void setT_user_pwd(String t_user_pwd) {
        this.t_user_pwd = t_user_pwd;
    }

    public String getT_role() {
        return t_role;
    }

    public void setT_role(String t_role) {
        this.t_role = t_role;
    }

    public String getT_status() {
        return t_status;
    }

    public void setT_status(String t_status) {
        this.t_status = t_status;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "t_user_id='" + t_user_id + '\'' +
                ", t_user_name='" + t_user_name + '\'' +
                ", t_user_pwd='" + t_user_pwd + '\'' +
                ", t_role='" + t_role + '\'' +
                ", t_status='" + t_status + '\'' +
                '}';
    }
}

