package com.zhaoyu.mapper.BaseModules;

import com.zhaoyu.domain.BaseModules.User;
import com.zhaoyu.entity.BaseModules.request.LoginRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    // 查询用户和密码
    @Select("select * from user where mobile = #{mobile} and password = #{password}")
    User getByUsernameAndPassword(LoginRequest loginEntity);
}
