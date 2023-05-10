package com.example.springboard.user.service;

import com.example.springboard.user.dto.request.UserAddRequest;
import com.example.springboard.user.dto.request.UserLoginRequest;
import com.example.springboard.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public int selectOneUserLogin(UserLoginRequest userLoginRequest) {
        return userMapper.selectOneUserLogin(userLoginRequest);
    }

    public int insertUser(UserAddRequest userAddRequest) {
        return userMapper.insertUser(userAddRequest);
    }
}
