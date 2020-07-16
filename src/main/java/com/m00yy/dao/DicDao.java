package com.m00yy.dao;

import com.m00yy.entity.DicCode;
import com.m00yy.model.DicType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DicDao {
    //    MyBatis动态sql，if,where,set,trim
//    select * from t_dic_code
//    select * from t_dic_code where ...
    @Select("<script>select * from t_dic_code " +
            "<where>" +
            "<if test='t_type!=null and t_type!=\"\"'>" +
            "t_type=#{t_type}" +
            "</if>" +
            "</where>" +
            "</script>")
    List<DicCode> selectAllDicInfo(@Param("t_type") String t_type);

    @Select("select distinct t_type from t_dic_code")
    List<DicType> selectAllType();

    @Insert("insert into t_dic_code values(uuid(),uuid(),#{t_name},#{t_type})")
    Integer addType(@Param("t_type") String t_type, @Param("t_name") String t_name);

    @Update("update t_dic_code set t_name=#{t_name} where t_dic_id=#{t_dic_id}")
    Integer updateType(@Param("t_dic_id") String t_dic_id, @Param("t_name") String t_name);

    @Delete("delete from t_dic_code where t_dic_id = #{t_dic_id}")
    Integer deleteType(@Param("t_dic_id") String t_dic_id);
}
