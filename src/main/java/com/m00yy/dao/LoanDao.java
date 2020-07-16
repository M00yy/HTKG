package com.m00yy.dao;

import com.m00yy.entity.CompanyCode;
import com.m00yy.entity.Loan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LoanDao {

    @Select("select t_com_name,t_zichanheji,t_huobizijin,t_yingshouzhangkuan,t_gudingzichanheji,t_faren from t_company inner join t_zichanfuzhai on t_zichanfuzhai.t_com_id = t_company.t_com_id")
//    @Select("select t_com_name from t_zichanfuzhai inner join t_company on t_zichanfuzhai.t_com_id = t_company.t_com_id")
    List<Loan> selectLoan();

    @Select("select t_com_name,t_zichanheji,t_huobizijin,t_yingshouzhangkuan,t_gudingzichanheji,t_faren from t_company inner join t_zichanfuzhai on t_zichanfuzhai.t_com_id = t_company.t_com_id where t_company.t_com_name=#{t_com_name}")
    Loan selectAllLoan(String t_com_name);

    @Update("update t_company inner join t_zichanfuzhai on t_company.t_com_id=t_zichanfuzhai.t_com_id set t_com_name=#{t_com_name},t_zichanheji=#{t_zichanheji},t_huobizijin=#{t_huobizijin},t_yingshouzhangkuan=#{t_yingshouzhangkuan},t_gudingzichanheji=#{t_gudingzichanheji},t_faren=#{t_faren} where t_com_name=#{t_com_name}")
    Integer updateLoan(Loan loan);

    @Delete("delete t_company,t_zichanfuzhai from t_company inner join t_zichanfuzhai as t_zichanfuzhai on t_company.t_com_id = t_zichanfuzhai.t_com_id where t_com_name =#{t_com_name}")
    Integer deleteLoan(String t_com_name);
}
