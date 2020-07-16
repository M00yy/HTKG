package com.m00yy.model;

import java.io.Serializable;

public class UserPersonModel implements Serializable {
    private String t_user_id;
    private String t_user_name;
    private String t_name;
    private String t_com_name;
    private String t_gender;
    private String t_mobile;
    private String t_status;
    private String t_cname;

    public UserPersonModel() {
    }

    public UserPersonModel(String t_user_id, String t_user_name, String t_name, String t_com_name, String t_gender, String t_mobile, String t_status) {
        this.t_user_id = t_user_id;
        this.t_user_name = t_user_name;
        this.t_name = t_name;
        this.t_com_name = t_com_name;
        this.t_gender = t_gender;
        this.t_mobile = t_mobile;
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

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_com_name() {
        return t_com_name;
    }

    public void setT_com_name(String t_com_name) {
        this.t_com_name = t_com_name;
    }

    public String getT_gender() {
        return t_gender;
    }

    public void setT_gender(String t_gender) {
        this.t_gender = t_gender;
    }

    public String getT_mobile() {
        return t_mobile;
    }

    public void setT_mobile(String t_mobile) {
        this.t_mobile = t_mobile;
    }

    public String getT_status() {
        return t_status;
    }

    public void setT_status(String t_status) {
        this.t_status = t_status;
    }

    public String getT_cname() {
        return t_cname;
    }

    public void setT_cname(String t_cname) {
        this.t_cname = t_cname;
    }

    @Override
    public String toString() {
        return "UserPersonModel{" +
                "t_user_id='" + t_user_id + '\'' +
                ", t_user_name='" + t_user_name + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_com_name='" + t_com_name + '\'' +
                ", t_gender='" + t_gender + '\'' +
                ", t_mobile='" + t_mobile + '\'' +
                ", t_status='" + t_status + '\'' +
                ", t_cname='" + t_cname + '\'' +
                '}';
    }
}
