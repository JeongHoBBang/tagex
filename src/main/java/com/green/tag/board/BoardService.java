package com.green.tag.board;

import com.green.tag.board.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
    @Autowired

    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }
    public int insBoard(BoardInsDto dto){
        return mapper.insBoard(dto);
    }
    public List<BoardVo> selBoard(BoardSelDto dto){
        return mapper.selBoard(dto);
    }
    public BoardPageDto maxBoard(BoardPageDto dto){
        int max = mapper.maxBoard(dto);
        double i = Math.ceil((double) max / dto.getRow());
        dto.setPage((int)i);
        return dto;
    }
    public List<BoardseVo> seBoard(BoardseDto dto){
        int num = dto.getPage()-1;
        dto.setStartidx(num*dto.getRow());
        return mapper.seBoard(dto);
    }

}
