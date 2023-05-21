package com.example.springboard.noticeBoard.dto.reauest;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class NoticeWriteAddRequest {
    private final String noticeTitle;
    private final String noticeRegId;
    private final String noticeGender;
    private final String noticeContent;
}
