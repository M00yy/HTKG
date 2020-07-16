package com.m00yy.entity;

import java.io.Serializable;

public class Person implements Serializable {
    private String t_person_id;
    private String t_user_id;
    private String t_com_id;
    private String t_dic_id;
    private String t_gender;
    private String t_mobile;
    private String t_email;
    private String t_cname;

    public Person() {
    }

    public Person(String t_person_id, String t_user_id, String t_com_id, String t_dic_id, String t_gender, String t_mobile, String t_email, String t_cname) {
        this.t_person_id = t_person_id;
        this.t_user_id = t_user_id;
        this.t_com_id = t_com_id;
        this.t_dic_id = t_dic_id;
        this.t_gender = t_gender;
        this.t_mobile = t_mobile;
        this.t_email = t_email;
        this.t_cname = t_cname;
    }

    public String getT_person_id() {
        return t_person_id;
    }

    public void setT_person_id(String t_person_id) {
        this.t_person_id = t_person_id;
    }

    public String getT_user_id() {
        return t_user_id;
    }

    public void setT_user_id(String t_user_id) {
        this.t_user_id = t_user_id;
    }

    public String getT_com_id() {
        return t_com_id;
    }

    public void setT_com_id(String t_com_id) {
        this.t_com_id = t_com_id;
    }

    public String getT_dic_id() {
        return t_dic_id;
    }

    public void setT_dic_id(String t_dic_id) {
        this.t_dic_id = t_dic_id;
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

    public String getT_email() {
        return t_email;
    }

    public void setT_email(String t_email) {
        this.t_email = t_email;
    }

    public String getT_cname() {
        return t_cname;
    }

    public void setT_cname(String t_cname) {
        this.t_cname = t_cname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "t_person_id='" + t_person_id + '\'' +
                ", t_user_id='" + t_user_id + '\'' +
                ", t_com_id='" + t_com_id + '\'' +
                ", t_dic_id='" + t_dic_id + '\'' +
                ", t_gender='" + t_gender + '\'' +
                ", t_mobile='" + t_mobile + '\'' +
                ", t_email='" + t_email + '\'' +
                ", t_cname='" + t_cname + '\'' +
                '}';
    }
}
