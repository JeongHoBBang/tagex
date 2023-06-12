package com.green.tag.board;

import com.green.tag.board.model.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;
    @Autowired

    public BoardController(BoardService service) {
        this.service = service;
    }
    @PostMapping
    @Operation(summary = "목표작성")
    public int insBoard(@RequestBody BoardInsDto dto){
        return service.insBoard(dto);
    }
//    @GetMapping("/{iuser}")
//    public List<BoardVo> selBoard(@PathVariable Long iuser){
//        BoardSelDto dto = new BoardSelDto();
//        dto.setIuser(iuser);
//        return service.selBoard(dto);
//    }
    @GetMapping("/maxpage")
    public BoardPageDto maxBoard(@RequestParam (defaultValue = "40")int row){
        BoardPageDto dto = new BoardPageDto();
        dto.setRow(row);
        return service.maxBoard(dto);
    }
    @GetMapping("/{iuser}")
    public List<BoardseVo> seBoard(@PathVariable Long iuser,@RequestParam (defaultValue = "1") int
            page,@RequestParam (defaultValue = "5")int row){
        BoardseDto dto = new BoardseDto();
        dto.setIuser(iuser);
        dto.setPage(page);
        dto.setRow(row);
        return service.seBoard(dto);
    }
}
