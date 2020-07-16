package com.m00yy.controller;

import com.m00yy.entity.Person;
import com.m00yy.model.MyResponseData;
import com.m00yy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService service;
    @RequestMapping("/person/selectPersonById")
    public Person selectPersonById(String t_user_id){
        return service.selectPersonById(t_user_id);
    }

    @RequestMapping("/person/updatePerson")
    public MyResponseData updatePerson(Person person){
        MyResponseData responseData = new MyResponseData();
        System.out.println("person="+person);
        Integer count = service.updatePerson(person);
        if(count ==1){
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("个人资料编辑成功");
        }else{
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("个人资料编辑失败");
        }
        return responseData;
    }
}

