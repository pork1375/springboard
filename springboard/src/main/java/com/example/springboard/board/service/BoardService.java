package com.example.springboard.board.service;

import com.example.springboard.board.dto.response.BoardResponse;
import com.example.springboard.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public List<BoardResponse> selectBoardList() {
        return boardMapper.selectBoardList();
    }

}
