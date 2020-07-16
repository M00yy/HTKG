package com.m00yy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 进行简单的页面跳转
 */
@Controller
public class DirectionController {
    @RequestMapping("/gotoRegister")
    public String gotoRegister() {
//        默认在返回值的前端加上视图解析器的前缀，/pages/，后面在家长后缀，.html
        return "register";
    }

    @RequestMapping("/gotoManagerIndex")
    public String gotoManagerIndex() {
        return "managerIndex";
    }

    @RequestMapping("/userinfo")
    public String userinfo() {
        return "userinfo";
    }

    @RequestMapping("/financeManager")
    public String moneyOut() {
        return "financeManager";
    }

    @RequestMapping("/moneyin")
    public String moneyIn() {
        return "moneyin";
    }

    @RequestMapping("/moneyout")
    public String moneyOut1() {
        return "moneyout";
    }

    @RequestMapping("/gotoConsole")
    public String gotoConsole() {
        return "console";
    }

    @RequestMapping("/dicInfo")
    public String dicInfo() {
        return "dicInfo";
    }

    @RequestMapping("/gotoLogin")
    public String gotoLogin() {
        return "../index";
    }

    @RequestMapping("/gotoUserCenter")
    public String gotoUserCenter() {
        return "usercenter";
    }

    @RequestMapping("/companyInfo")
    public String gotoCompanyInfo() {
        return "companyinfo";
    }

    @RequestMapping("/companyManager")
    public String gotoCompanyManager() {
        return "companymanager";
    }

}