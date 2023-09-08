package com.zhaoyu.mapper.BaseModules;

import com.zhaoyu.domain.BaseModules.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegisterMapper {

    @Select("select mobile from user where mobile = #{mobile}")
    User findByMobile(Object getMobile);
}
