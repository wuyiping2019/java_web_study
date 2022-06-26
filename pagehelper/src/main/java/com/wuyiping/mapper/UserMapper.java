package com.wuyiping.mapper;

import com.wuyiping.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    /**
     * 查询用户:
     * 通过name或者age进行查询，或者一起查询
     */
    List<User> selectUser(User User);
}
