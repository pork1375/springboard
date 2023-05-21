package com.example.springboard.noticeBoard.mapper;

import com.example.springboard.noticeBoard.dto.reauest.NoticeWriteAddRequest;
import com.example.springboard.noticeBoard.dto.response.NoticeBoardResponse;
import com.example.springboard.user.dto.request.UserAddRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/**
 1. MyBatis 3.0부터 지원하는 기능. MyBatis와 같은 ORM(Object Relation Mapping) 프레임워크에서 사용
 2. @Mapper 어노테이션을 선언한 interface를 생성하면 따로 implements(구현) 생략
 3. @Mapper 어노테이션에 생성한 API의 이름과 MyBatis Mapper에 작성한 Sql ID는 반드시 일치해야 함
 4. MyBatis Mapper의 namespace는 인터페이스의 풀패키지 경로를 입력
 **/
public interface NoticeBoardMapper {

    List<NoticeBoardResponse> noticeSelectBoardList();

    int noticeInsertWrite(NoticeWriteAddRequest noticeWriteAddRequest);

}
