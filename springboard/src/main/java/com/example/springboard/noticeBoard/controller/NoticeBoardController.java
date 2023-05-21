package com.example.springboard.noticeBoard.controller;

import com.example.springboard.noticeBoard.dto.reauest.NoticeWriteAddRequest;
import com.example.springboard.noticeBoard.dto.response.NoticeBoardResponse;
import com.example.springboard.noticeBoard.service.NoticeBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NoticeBoardController {

    private final NoticeBoardService noticeBoardService;

    @RequestMapping("/noticeBoard")
    public String noticeBoard(Model model) {
        List<NoticeBoardResponse> noticeBoardResponses = noticeBoardService.noticeSelectBoardList();

        System.out.println("noticeBoardResponses ==> " + noticeBoardResponses);

        model.addAttribute("noticeBoardList", noticeBoardResponses);
        return "board/noticeBoard";
    }

    /**
     게시글 작성 화면
     * */
    @GetMapping("noticeWrite")
    public String write() {
        return "board/noticeWrite";
    }

    /**
     게시글 쓰기 등록
     * */
    @PostMapping("noticeWrite")
    @ResponseBody
    public int noticeInsertWrite(@RequestBody NoticeWriteAddRequest noticeWriteAddRequest) {
        return noticeBoardService.noticeInsertWrite(noticeWriteAddRequest);
    }

}
