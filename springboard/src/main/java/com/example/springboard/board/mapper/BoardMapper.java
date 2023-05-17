package com.example.springboard.board.mapper;

import com.example.springboard.board.dto.request.WriteAddRequest;
import com.example.springboard.board.dto.response.BoardResponse;
import com.example.springboard.user.dto.request.UserAddRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardResponse> selectBoardList();

    int insertWrite(WriteAddRequest writeAddRequest);

}
