package com.example.springboard.board.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class WriteAddRequest {
    private final String title;
    private final String regId;
    private final String content;

}
