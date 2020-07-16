package com.m00yy.model;

import java.io.Serializable;

public class DicType implements Serializable {
    private String t_type;

    public DicType() {
    }

    public DicType(String t_type) {
        this.t_type = t_type;
    }

    public String getT_type() {
        return t_type;
    }

    public void setT_type(String t_type) {
        this.t_type = t_type;
    }

    @Override
    public String toString() {
        return "DicType{" +
                "t_type='" + t_type + '\'' +
                '}';
    }
}