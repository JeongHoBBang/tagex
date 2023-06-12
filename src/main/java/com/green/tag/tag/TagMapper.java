package com.green.tag.tag;

import com.green.tag.boardtag.model.BoardTagDeDto;
import com.green.tag.boardtag.model.BoardTagDeVo;
import com.green.tag.tag.model.TagInsDto;
import com.green.tag.tag.model.TagSelDto;
import com.green.tag.tag.model.TagSelVo;
import com.green.tag.tag.model.TagUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {
    int insTag(TagInsDto dto);
    int updTag(TagUpdDto dto);
    List<TagSelVo> selTag(TagSelDto dto);
}
