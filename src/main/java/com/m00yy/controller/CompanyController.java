package com.m00yy.controller;

import com.m00yy.entity.CompanyCode;
import com.m00yy.model.MyResponseData;
import com.m00yy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService service;

    @RequestMapping("/com/selectAllCompany")
    public List<CompanyCode> selectAllCompany() {
        return service.selectAllCompany();
    }

    @RequestMapping("/com/selectAllCompanyInfo")
    public List<CompanyCode> selectAllCompanyInfo() {
        return service.selectAllCompanyInfo();
    }

    @RequestMapping("/com/selectCompanyByName")
    public CompanyCode selectCompanyByName(String t_com_name) {
        return service.selectCompanyByName(t_com_name);
    }

    @RequestMapping("/com/insertCompany")
    public MyResponseData insertCompany(String t_com_name, String t_org_code, String t_address, String t_zhuceriqi, String t_zhuciziben, String t_faren) {
        MyResponseData responseData = new MyResponseData();
//        System.out.println("t_type="+t_type+",t_name="+t_name);
        Integer count = service.insertCompany(t_com_name, t_org_code, t_address, t_zhuceriqi, t_zhuciziben, t_faren);
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

    @RequestMapping("/com/updateCompany")
    public MyResponseData updateCompany(CompanyCode company) {
        MyResponseData responseData = new MyResponseData();
        System.out.println("company=" + company);
        Integer count = service.updateCompany(company);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("公司资料编辑成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("公司资料编辑失败");
        }
        return responseData;
    }

    @RequestMapping("/com/deleteCompany")
    public MyResponseData deleteCompany(String t_com_name) {
        MyResponseData responseData = new MyResponseData();
        System.out.println("aaaaaaaaaaaaaa");
        Integer count = service.deleteCompany(t_com_name);
        if (count == 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("删除成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("删除失败");
        }
        return responseData;
    }
}
