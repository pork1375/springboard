package com.example.springboard.noticeBoard.service;

import com.example.springboard.noticeBoard.dto.reauest.NoticeWriteAddRequest;
import com.example.springboard.noticeBoard.dto.response.NoticeBoardResponse;
import com.example.springboard.noticeBoard.mapper.NoticeBoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 비즈니스 로직이나 respository layer 호출하는 함수에 사용
@RequiredArgsConstructor // final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
public class NoticeBoardService {

    private final NoticeBoardMapper noticeBoardMapper;
    /**
     * private final : 재할당하지 못하며, 해당 필드, 메서드별로 호출할 때마다 새로이 값이 할당(인스턴스화)한다.
     * 무언가를 제한하겠다는 의미
     * 재할당을 제한함 - 메모리의 재할당, 즉 값은 변할 수 있음
     * 상수의 경우 재할당을 하지 못하면, 초기화값이 불변하기 때문에 값이 불변
     **/

    // 게시판 목록
    public List<NoticeBoardResponse> noticeSelectBoardList() {
        return noticeBoardMapper.noticeSelectBoardList();
    }

    //게시판 작성
    public int noticeInsertWrite(NoticeWriteAddRequest noticeWriteAddRequest) {
        System.out.println("NoticeWriteAddRequest 222 = " + noticeWriteAddRequest);
        return noticeBoardMapper.noticeInsertWrite(noticeWriteAddRequest);

    }

}
