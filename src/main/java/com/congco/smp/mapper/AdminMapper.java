package com.congco.smp.mapper;

import com.congco.smp.pojo.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * created on 2019年08月07日16:13:18
 * @author congco
 */
public interface AdminMapper {


    @Insert("insert into admin(username,password,create_time,update_time) values(#{username},#{password},#{createTime},#{updateTime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
     Integer addAdmin(Admin admin);


}
