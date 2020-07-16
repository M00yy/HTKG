package com.m00yy.controller;

import com.m00yy.entity.Loan;
import com.m00yy.model.MyResponseData;
import com.m00yy.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    private LoanService service;

    @RequestMapping("/com/selectLoan")
    public List<Loan> selectLoan() {
        return service.selectLoan();

    }

    @RequestMapping("/com/selectAllLoan")
    public Loan selectAllLoan(String t_com_name) {
        return service.selectAllLoan(t_com_name);
    }

    @RequestMapping("/com/updateLoan")
    public MyResponseData updateLoan(Loan loan) {
        MyResponseData responseData = new MyResponseData();
        System.out.println("loan=" + loan);
        Integer count = service.updateLoan(loan);
        if (count >= 1) {
            responseData.setError(0);
            responseData.setStatus("success");
            responseData.setMsg("公司财务资料编辑成功");
        } else {
            responseData.setError(-1);
            responseData.setStatus("error");
            responseData.setMsg("公司财务资料编辑失败");
        }
        return responseData;
    }

    @RequestMapping("/com/deleteLoan")
    public MyResponseData deleteCompany(String t_com_name) {
        MyResponseData responseData = new MyResponseData();
        System.out.println("aaaaaaaaaaaaaa");
        Integer count = service.deleteLoan(t_com_name);
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
