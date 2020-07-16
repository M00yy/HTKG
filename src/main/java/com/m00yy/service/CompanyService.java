package com.m00yy.service;

import com.m00yy.dao.CompanyDao;
import com.m00yy.entity.CompanyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyDao dao;

    public List<CompanyCode> selectAllCompany() {
        return dao.selectAllCompany();
    }

    public List<CompanyCode> selectAllCompanyInfo() {
        return dao.selectAllCompanyInfo();
    }

    public CompanyCode selectCompanyByName(String t_com_name) {
        return dao.selectCompanyByName(t_com_name);
    }

    public Integer updateCompany(CompanyCode company) {
        return dao.updateCompany(company);
    }

    public Integer deleteCompany(String t_com_name) {
        return dao.deleteCompany(t_com_name);
    }

    public Integer insertCompany(String t_com_name, String t_org_code, String t_address, String t_zhuceriqi, String t_zhuciziben, String t_faren) {
        return dao.insertCompany(t_com_name, t_org_code, t_address, t_zhuceriqi, t_zhuciziben, t_faren);
    }
}

