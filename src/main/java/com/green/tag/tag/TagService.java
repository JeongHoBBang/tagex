package com.green.tag.tag;

import com.green.tag.tag.model.TagInsDto;
import com.green.tag.tag.model.TagSelDto;
import com.green.tag.tag.model.TagSelVo;
import com.green.tag.tag.model.TagUpdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    private final TagMapper mapper;
    @Autowired

    public TagService(TagMapper mapper) {
        this.mapper = mapper;
    }
    public int insTag(TagInsDto dto){
        return mapper.insTag(dto);
    }
    public int updTag(TagUpdDto dto){
        return mapper.updTag(dto);
    }
    public List<TagSelVo> selTag(TagSelDto dto){
        return mapper.selTag(dto);
    }

}
