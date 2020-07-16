package com.m00yy.service;

import com.m00yy.dao.DicDao;
import com.m00yy.entity.DicCode;
import com.m00yy.model.DicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DicService {
    @Autowired
    private DicDao dao;

    public List<DicCode> selectAllDicInfo(String t_type){
        return dao.selectAllDicInfo(t_type);
    }

    public List<DicType> selectAllType(){
        return dao.selectAllType();
    }

    public Integer addType(String t_type,String t_name){
        return  dao.addType(t_type,t_name);
    }

    public Integer updateType(String t_dic_id,String t_name){
        return dao.updateType(t_dic_id,t_name);
    }

    public Integer deleteType(String t_dic_id){
        return dao.deleteType(t_dic_id);
    }
}

