package com.team.ten.dao;

import com.team.ten.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    User selectUserByName(String name);
}
