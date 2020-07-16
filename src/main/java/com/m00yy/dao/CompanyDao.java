package com.m00yy.dao;

import com.m00yy.entity.CompanyCode;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CompanyDao {
    @Select("select * from t_company where t_com_name!='-'")
    List<CompanyCode> selectAllCompany();

    @Select("select t_com_name,t_org_code,t_address,t_zhuceriqi,t_zhuciziben,t_faren from t_company")
    List<CompanyCode> selectAllCompanyInfo();

    @Select("select * from t_company where t_com_name=#{t_com_name}")
    CompanyCode selectCompanyByName(String t_com_name);

    @Update("update t_company set t_com_name=#{t_com_name},t_org_code=#{t_org_code},t_address=#{t_address},t_zhuceriqi=#{t_zhuceriqi},t_zhuciziben=#{t_zhuciziben},t_faren=#{t_faren} where t_com_name=#{t_com_name}")
    Integer updateCompany(CompanyCode company);

    @Delete("delete from t_company where t_com_name=#{t_com_name};")
    Integer deleteCompany(String t_com_name);

    @Insert("insert into t_company values(uuid(),uuid(),#{t_com_name},#{t_org_code},#{t_address},#{t_zhuceriqi},#{t_zhuciziben},#{t_faren})")
    Integer insertCompany(@Param("t_com_name") String t_com_name, @Param("t_org_code") String t_org_code, @Param("t_address") String t_address, @Param("t_zhuceriqi") String t_zhuceriqi, @Param("t_zhuciziben") String t_zhuciziben, @Param("t_faren") String t_faren);
}
