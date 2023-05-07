package com.example.springboard.user.dto.request;

import lombok.*;

@Getter
@ToString
@RequiredArgsConstructor
public class UserLoginRequest {

    private final String userId;
    private final String password;

}
