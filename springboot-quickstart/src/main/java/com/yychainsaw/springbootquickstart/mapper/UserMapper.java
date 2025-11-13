package com.yychainsaw.springbootquickstart.mapper;

import com.yychainsaw.springbootquickstart.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id from user where id = #{id}")
    User getUserById(@Param("id") Integer id);
}
