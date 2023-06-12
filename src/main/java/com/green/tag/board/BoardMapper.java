package com.green.tag.board;

import com.green.tag.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsDto dto);
    List<BoardVo> selBoard(BoardSelDto dto);
    int maxBoard(BoardPageDto dto);
    List<BoardseVo> seBoard(BoardseDto dto);
}
