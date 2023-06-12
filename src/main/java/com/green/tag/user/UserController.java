package com.green.tag.user;

import com.green.tag.board.BoardService;
import com.green.tag.board.model.BoardSelDto;
import com.green.tag.board.model.BoardVo;
import com.green.tag.user.model.UserInsDto;
import com.green.tag.user.model.UserUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;
    @Autowired

    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping
    @Operation(summary = "회원가입")
    public int insUser(@RequestBody UserInsDto dto){
        return service.insUser(dto);
    }
    @PatchMapping
    @Operation(summary = "비밀번호변경")
    public int updUser(@RequestBody UserUpdDto dto){
        return service.updUser(dto);
    }

}
