package com.green.tag.boardtag;

import com.green.tag.board.model.BoardseDto;
import com.green.tag.boardtag.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boardtag")
public class BoardTagController {
    private final BoardTagService service;
    @Autowired

    public BoardTagController(BoardTagService service) {
        this.service = service;
    }
    @PostMapping
    public int insTb(@RequestBody BoardTagInsDto dto){
        return service.insTb(dto);
    }
    @GetMapping("/{iboard}")
    public List<BoardTagVo> selBt(@PathVariable Long iboard){
        BoardTagSeDto dto = new BoardTagSeDto();
        dto.setIboard(iboard);
        return service.selBt(dto);
    }
    @GetMapping("/{iboard}/tag")
    public BoardTagDeVo deBt(@PathVariable Long iboard){
        BoardTagSeDto dto = new BoardTagSeDto();
        dto.setIboard(iboard);
        return service.deBt(dto);
    }
}
