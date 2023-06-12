package com.green.tag.boardtag;

import com.green.tag.boardtag.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardTagMapper {
    int insTb(BoardTagInsDto dto);
    List<BoardTagVo> selBt(BoardTagSeDto dto);
    List<BoardTagDeVo> deBt(BoardTagDeDto dto);
}
