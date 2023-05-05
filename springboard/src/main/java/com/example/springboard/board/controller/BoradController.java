package com.example.springboard.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoradController {

    @RequestMapping("/")
    public String testboard() {
        return "board/board";
    }

}
