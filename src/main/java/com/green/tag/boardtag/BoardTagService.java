package com.green.tag.boardtag;

import com.green.tag.board.model.BoardseDto;
import com.green.tag.boardtag.model.*;
import com.green.tag.tag.TagMapper;
import com.green.tag.tag.model.TagSelDto;
import com.green.tag.tag.model.TagSelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardTagService {
    private final BoardTagMapper mapper;
    private final TagMapper tagmapper;
    @Autowired
    public BoardTagService(BoardTagMapper mapper,TagMapper tagmapper) {
        this.mapper = mapper;
        this.tagmapper = tagmapper;
    }


    public int insTb(BoardTagInsDto dto){
        return mapper.insTb(dto);
    }
    public List<BoardTagVo> selBt(BoardTagSeDto dto){
        return mapper.selBt(dto);

    }
    public BoardTagDeVo deBt(BoardTagSeDto dto){
        TagSelDto dto1 = new TagSelDto();
        dto1.setIboard(dto.getIboard());
        List<TagSelVo> tag = tagmapper.selTag(dto1);
        List<BoardTagVo> boardTagVos = mapper.selBt(dto);
        BoardTagDeVo build = BoardTagDeVo.builder().boardtag(boardTagVos).tag(tag).build();
        return build;
    }

}
