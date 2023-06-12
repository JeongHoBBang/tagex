package com.green.tag.boardtag.model;

import com.green.tag.tag.model.TagSelVo;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Getter
@Builder
public class BoardTagDeVo {
    private List<BoardTagVo> boardtag;
    private List<TagSelVo> tag;


}
