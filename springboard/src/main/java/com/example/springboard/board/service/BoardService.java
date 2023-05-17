package com.example.springboard.board.service;

import com.example.springboard.board.dto.request.WriteAddRequest;
import com.example.springboard.board.dto.response.BoardResponse;
import com.example.springboard.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    //게시판 목록
    public List<BoardResponse> selectBoardList() {
        return boardMapper.selectBoardList();
    }

    //게시판 작성
    public int insertWrite(WriteAddRequest writeAddRequest) {
        System.out.println("writeAddRequest 222 = " + writeAddRequest);
        return boardMapper.insertWrite(writeAddRequest);
    }
}
