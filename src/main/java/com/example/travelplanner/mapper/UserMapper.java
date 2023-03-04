package com.example.travelplanner.mapper;

import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserDTO user);
    UserDTO toDto(User user);
    List<User> toEntityList(Iterable<UserDTO>userDTOS);
    List<UserDTO>toDtoList(Iterable<User>users);
}
