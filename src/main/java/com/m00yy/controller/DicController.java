package com.m00yy.controller;

import com.m00yy.entity.DicCode;
import com.m00yy.model.MyResponseData;
import com.m00yy.service.DicService;
import com.m00yy.model.DicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DicController {
    @Autowired
    private DicService service;

    @RequestMapping("/dic/selectAllDicInfo")
    public List<DicCode> selectAllDicInfo(String t_type) {
//        System.out.println("t_type"+t_type);
        return service.selectAllDicInfo(t_type);
    }

    @RequestMapping("/dic/selectAllType")
    public List<DicType> selectAllType() {
        return service.selectAllType();
    }

    @RequestMapping("/dic/addType")
    public MyResponseData addType(String t_type, String t_name) {
        MyResponseData responseData = new MyResponseData();
//        System.out.println("t_type="+t_type+",t_name="+t_name);
        Integer count = service.addType(t_type, t_name);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("添加类型成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("添加类型失败");
        }
        return responseData;
    }

    @RequestMapping("/dic/updateType")
    public MyResponseData updateType(String t_dic_id, String t_name) {
        MyResponseData responseData = new MyResponseData();
        Integer count = service.updateType(t_dic_id, t_name);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("编辑类型成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("编辑类型失败");
        }
        return responseData;
    }

    @RequestMapping("/dic/deleteType")
    public MyResponseData deleteType(String t_dic_id) {
        MyResponseData responseData = new MyResponseData();
        Integer count = service.deleteType(t_dic_id);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("删除类型成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("删除类型失败");
        }
        return responseData;
    }
}
