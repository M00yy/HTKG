package com.m00yy.controller;


import com.m00yy.model.MyResponseData;
import com.m00yy.model.SysUserModel;
import com.m00yy.model.UserPersonModel;
import com.m00yy.service.LoanService;
import com.m00yy.service.PersonService;
import com.m00yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户相关的操作
 *
 * @RestController:把方法的返回值，转成JSON数据，返回给前端页面
 */

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private PersonService personService;

    @Autowired
    private LoanService loanService;

    @RequestMapping("/user/login")
    public MyResponseData login(String username, String userpwd, HttpSession session) {
        MyResponseData responseData = new MyResponseData();
        System.out.println("name=" + username + ",pwd=" + userpwd);
        SysUserModel model = service.login(username, userpwd);
        System.out.println("model=" + model);
        if (model != null) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("登录成功");
            responseData.setObj(model);
            session.setAttribute("user", model);

        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("登录失败");
            responseData.setObj(null);
        }
        return responseData;
    }

    @RequestMapping("/user/getUserInfo")
    public SysUserModel getUserInfo(HttpSession session) {
        SysUserModel model = (SysUserModel) session.getAttribute("user");
        return model;

    }

    @RequestMapping("/user/selectAllPersonInfo")
//    返回数据被bootstrap-table控件接收，bootstrap-table要求放回的json串一个JSON数据
    public List<UserPersonModel> selectAllPersonInfo() {
        List<UserPersonModel> list = service.selectAllPersonInfo();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }

    @RequestMapping("/user/changeStatus")
    public MyResponseData changeStatus(String t_user_id) {
        MyResponseData responseData = new MyResponseData();
        Integer count = service.changeStatus(t_user_id);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("审核成功");
            System.out.println(t_user_id);
            personService.insertPerson(t_user_id);
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("审核失败");
        }
        return responseData;
    }

    @RequestMapping("/user/register")
    public MyResponseData register(String username, String userpwd) {
        MyResponseData responseData = new MyResponseData();
        Integer count = service.register(username, userpwd);
        if (count == -2) {
            responseData.setError(-2);
            responseData.setStatus("username exist");
            responseData.setMsg("该用户名已经存在，请重新选择一个用户名");
        } else if (count > 0) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("注册成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("注册失败");
        }
        return responseData;
    }

    @RequestMapping("/user/updateAuth")
    public MyResponseData updateAuth(String t_user_id, String t_role) {
        MyResponseData responseData = new MyResponseData();
        Integer count = service.updateAuth(t_user_id, t_role);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("分配权限成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("分配权限失败");
        }
        return responseData;
    }
}
