package com.example.springboard.board.controller;

import com.example.springboard.board.dto.response.BoardResponse;
import com.example.springboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
