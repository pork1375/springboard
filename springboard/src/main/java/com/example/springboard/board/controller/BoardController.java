package com.example.springboard.board.controller;

import com.example.springboard.board.dto.request.WriteAddRequest;
import com.example.springboard.board.dto.response.BoardResponse;
import com.example.springboard.board.service.BoardService;
import com.example.springboard.user.dto.request.UserAddRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/board")
    public String board(Model model) {
        List<BoardResponse> boardResponses = boardService.selectBoardList();

        System.out.println("boardResponses ==> " + boardResponses);

        model.addAttribute("boardList", boardResponses);
        return "board/board";
    }

    /**
     * 글 쓰기 화면
     * */
    @GetMapping("/write")
    public String write() {
        return "board/write";
    }

    /**
     * 글 쓰기 등록
     * */
    @PostMapping("/write")
    @ResponseBody
    public int insertWrite(@RequestBody WriteAddRequest writeAddRequest) {
        return boardService.insertWrite(writeAddRequest);
    }

}
