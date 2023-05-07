package com.example.springboard.user.mapper;

import com.example.springboard.user.dto.request.UserLoginRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int selectOneUserLogin(UserLoginRequest userLoginRequest);

}
