package com.example.springboard.board.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class BoardResponse {

    private final String title;
    private final String content;
    private final String regId;
    private final String regDate;
    private final String viewCnt;

}
