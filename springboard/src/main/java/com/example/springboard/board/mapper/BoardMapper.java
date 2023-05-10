package com.example.springboard.board.mapper;

import com.example.springboard.board.dto.response.BoardResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardResponse> selectBoardList();

}
