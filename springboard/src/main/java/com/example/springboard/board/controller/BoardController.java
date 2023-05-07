package com.example.springboard.board.controller;

import com.example.springboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/board")
    public String board() {
        boardService.selectTest();
        return "board/board";
    }

}
