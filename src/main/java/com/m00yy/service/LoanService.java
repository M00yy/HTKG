package com.m00yy.service;

import com.m00yy.dao.LoanDao;
import com.m00yy.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanDao dao;

    public List<Loan> selectLoan() {
        return dao.selectLoan();
    }

    public Loan selectAllLoan(String t_com_name) {
        return dao.selectAllLoan(t_com_name);
    }

    public Integer updateLoan(Loan loan) {
        return dao.updateLoan(loan);
    }

    public Integer deleteLoan(String t_com_name){
        return dao.deleteLoan(t_com_name);
    }
}
