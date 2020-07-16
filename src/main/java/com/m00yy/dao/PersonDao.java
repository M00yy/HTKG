package com.m00yy.dao;

import com.m00yy.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PersonDao {
    @Insert("insert into t_person (t_person_id,t_user_id) values(uuid(),#{t_user_id})")
    Integer insertPerson(String t_user_id);

    @Select("select * from t_person where t_user_id=#{t_user_id}")
    Person selectPersonById(String t_user_id);

    @Update("update t_person set t_com_id=#{t_com_id},t_gender=#{t_gender},t_mobile=#{t_mobile},t_email=#{t_email},t_cname=#{t_cname} where t_user_id=#{t_user_id}")
    Integer updatePerson(Person person);
}
