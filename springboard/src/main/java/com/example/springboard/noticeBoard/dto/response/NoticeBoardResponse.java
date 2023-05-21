package com.example.springboard.noticeBoard.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class NoticeBoardResponse {
    private final String noticeTitle;
    private final String noticeContent;
    private final String noticeRegId;
    private final String noticeGender;
    private final String noticeRegDate;
    private final String noticeViewCnt;
}
