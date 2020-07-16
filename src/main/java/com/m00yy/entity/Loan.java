package com.m00yy.entity;

import java.io.Serializable;

public class Loan implements Serializable {
    private String t_com_id;
    private String t_com_pid;
    private String t_com_name;
    private String t_org_code;
    private String t_address;
    private String t_zhuceriqi;
    private String t_zhuciziben;
    private String t_faren;
    private String t_zcfz_id;
    private String t_huobizijin;
    private String t_yingshouzhangkuan;
    private String t_gudingzichanheji;
    private String t_zichanheji;
    private String leijizhejiu;

    public Loan() {
    }

    public Loan(String t_com_id, String t_com_pid, String t_com_name, String t_org_code, String t_address, String t_zhuceriqi, String t_zhuciziben, String t_faren, String t_zcfz_id, String t_huobizijin, String t_yingshouzhangkuan, String t_gudingzichanheji, String t_zichanheji, String leijizhejiu) {
        this.t_com_id = t_com_id;
        this.t_com_pid = t_com_pid;
        this.t_com_name = t_com_name;
        this.t_org_code = t_org_code;
        this.t_address = t_address;
        this.t_zhuceriqi = t_zhuceriqi;
        this.t_zhuciziben = t_zhuciziben;
        this.t_faren = t_faren;
        this.t_zcfz_id = t_zcfz_id;
        this.t_huobizijin = t_huobizijin;
        this.t_yingshouzhangkuan = t_yingshouzhangkuan;
        this.t_gudingzichanheji = t_gudingzichanheji;
        this.t_zichanheji = t_zichanheji;
        this.leijizhejiu = leijizhejiu;
    }

    public String getT_com_id() {
        return t_com_id;
    }

    public void setT_com_id(String t_com_id) {
        this.t_com_id = t_com_id;
    }

    public String getT_com_pid() {
        return t_com_pid;
    }

    public void setT_com_pid(String t_com_pid) {
        this.t_com_pid = t_com_pid;
    }

    public String getT_com_name() {
        return t_com_name;
    }

    public void setT_com_name(String t_com_name) {
        this.t_com_name = t_com_name;
    }

    public String getT_org_code() {
        return t_org_code;
    }

    public void setT_org_code(String t_org_code) {
        this.t_org_code = t_org_code;
    }

    public String getT_address() {
        return t_address;
    }

    public void setT_address(String t_address) {
        this.t_address = t_address;
    }

    public String getT_zhuceriqi() {
        return t_zhuceriqi;
    }

    public void setT_zhuceriqi(String t_zhuceriqi) {
        this.t_zhuceriqi = t_zhuceriqi;
    }

    public String getT_zhuciziben() {
        return t_zhuciziben;
    }

    public void setT_zhuciziben(String t_zhuciziben) {
        this.t_zhuciziben = t_zhuciziben;
    }

    public String getT_faren() {
        return t_faren;
    }

    public void setT_faren(String t_faren) {
        this.t_faren = t_faren;
    }

    public String getT_zcfz_id() {
        return t_zcfz_id;
    }

    public void setT_zcfz_id(String t_zcfz_id) {
        this.t_zcfz_id = t_zcfz_id;
    }

    public String getT_huobizijin() {
        return t_huobizijin;
    }

    public void setT_huobizijin(String t_huobizijin) {
        this.t_huobizijin = t_huobizijin;
    }

    public String getT_yingshouzhangkuan() {
        return t_yingshouzhangkuan;
    }

    public void setT_yingshouzhangkuan(String t_yingshouzhangkuan) {
        this.t_yingshouzhangkuan = t_yingshouzhangkuan;
    }

    public String getT_gudingzichanheji() {
        return t_gudingzichanheji;
    }

    public void setT_gudingzichanheji(String t_gudingzichanheji) {
        this.t_gudingzichanheji = t_gudingzichanheji;
    }

    public String getT_zichanheji() {
        return t_zichanheji;
    }

    public void setT_zichanheji(String t_zichanheji) {
        this.t_zichanheji = t_zichanheji;
    }

    public String getLeijizhejiu() {
        return leijizhejiu;
    }

    public void setLeijizhejiu(String leijizhejiu) {
        this.leijizhejiu = leijizhejiu;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "t_com_id='" + t_com_id + '\'' +
                ", t_com_pid='" + t_com_pid + '\'' +
                ", t_com_name='" + t_com_name + '\'' +
                ", t_org_code='" + t_org_code + '\'' +
                ", t_address='" + t_address + '\'' +
                ", t_zhuceriqi='" + t_zhuceriqi + '\'' +
                ", t_zhuciziben='" + t_zhuciziben + '\'' +
                ", t_faren='" + t_faren + '\'' +
                ", t_zcfz_id='" + t_zcfz_id + '\'' +
                ", t_huobizijin='" + t_huobizijin + '\'' +
                ", t_yingshouzhangkuan='" + t_yingshouzhangkuan + '\'' +
                ", t_gudingzijin='" + t_gudingzichanheji + '\'' +
                ", t_zichanheji='" + t_zichanheji + '\'' +
                ", leijizhejiu='" + leijizhejiu + '\'' +
                '}';
    }
}
