package com.example.springboard.user.controller;

import com.example.springboard.user.dto.request.UserLoginRequest;
import com.example.springboard.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String selectOneUserLogin() {
        return "login/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public int login(@RequestBody UserLoginRequest userLoginRequest) {
        System.out.println("userLogin ==> " + userLoginRequest);
        return userService.selectOneUserLogin(userLoginRequest);
    }

    /**
     * 회원가입
     * */
    @GetMapping("/user-add")
    public String userAdd() {
        return "user/user";
    }

}
