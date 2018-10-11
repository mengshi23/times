package com.time.dao;

import com.time.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void add(User user);

}
