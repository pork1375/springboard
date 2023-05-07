package com.example.springboard.user.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class UserLoginResponse {

    private String userId;
    private String password;

}
