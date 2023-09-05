package com.zhaoyu.mapper;

import com.zhaoyu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegisterMapper {

    @Select("select mobile from user where mobile = #{mobile}")
    User findByMobile(Object getMobile);
}
