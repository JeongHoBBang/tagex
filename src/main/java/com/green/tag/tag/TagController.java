package com.green.tag.tag;

import com.green.tag.tag.model.TagInsDto;
import com.green.tag.tag.model.TagSelDto;
import com.green.tag.tag.model.TagSelVo;
import com.green.tag.tag.model.TagUpdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    private final TagService service;
    @Autowired

    public TagController(TagService service) {
        this.service = service;
    }
    @PostMapping
    public int insTag(@RequestBody TagInsDto dto){
        return service.insTag(dto);
    }
    @PutMapping
    public int updTag(@RequestBody TagUpdDto dto){
        return service.updTag(dto);
    }
    @GetMapping("/{iboard}")
    public List<TagSelVo> selTag(@PathVariable Long iboard){
        TagSelDto dto = new TagSelDto();
        dto.setIboard(iboard);
        return service.selTag(dto);
    }
}
