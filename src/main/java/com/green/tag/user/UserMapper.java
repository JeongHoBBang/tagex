package com.green.tag.user;

import com.green.tag.user.model.UserInsDto;
import com.green.tag.user.model.UserUpdDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    int updUser(UserUpdDto dto);
}
