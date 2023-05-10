package com.example.springboard.user.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class UserAddRequest {
    private final String userId;
    private final String password;
    private final String gender;

}
