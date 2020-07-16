package com.m00yy.dao;

import com.m00yy.model.SysUserModel;
import com.m00yy.model.UserPersonModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问层，让数据库执行增删改查
 */
@Repository
@Mapper
public interface UserDao {
    @Select("select t_sys_user.*,t_dic_code.t_name from t_sys_user left join t_dic_code on t_role=t_dic_code where t_user_name=#{username} and t_user_pwd=#{userpwd} and t_status='1'")
    SysUserModel login(@Param("username") String username, @Param("userpwd") String userpwd);

    @Select("select t_sys_user.t_user_id,t_user_name,t_name,t_com_name,t_gender,t_mobile,t_status,t_cname from t_sys_user left join t_person on t_sys_user.t_user_id= t_person.t_user_id left join t_dic_code on t_role=t_dic_code left join t_company on t_company.t_com_id=t_person.t_com_id")
    List<UserPersonModel> selectAllPersonInfo();

    @Update("update t_sys_user set t_status='1' where t_user_id=#{t_user_id}")
    Integer changeStatus(String t_user_id);

    @Insert("insert into t_sys_user values(uuid(),#{username},#{userpwd},'','0')")
    Integer register(@Param("username") String username, @Param("userpwd") String userpwd);

    @Select("select count(*) from t_sys_user where t_user_name=#{username}")
    Integer isUsernameExist(String username);

    @Update("update t_sys_user set t_role=#{t_role} where t_user_id=#{t_user_id}")
    Integer updateAuth(@Param("t_user_id") String t_user_id, @Param("t_role") String t_role);
}
