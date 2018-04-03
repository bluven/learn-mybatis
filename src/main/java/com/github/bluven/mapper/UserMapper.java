package com.github.bluven.mapper;

import org.apache.ibatis.annotations.*;
import com.github.bluven.model.User;

import java.util.List;

/**
 * Created by bluven on 18/4/2.
 */


public interface UserMapper {
    
    @Select("SELECT count(*) FROM user")
    Integer count();
    
    List<User> selectAll();
}
