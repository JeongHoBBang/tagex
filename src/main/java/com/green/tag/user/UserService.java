package com.green.tag.user;

import com.green.tag.user.model.UserInsDto;
import com.green.tag.user.model.UserUpdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;
    @Autowired

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }
    public int insUser(UserInsDto dto){
        return mapper.insUser(dto);
    }
    public int updUser(UserUpdDto dto){
        return mapper.updUser(dto);
    }

}
