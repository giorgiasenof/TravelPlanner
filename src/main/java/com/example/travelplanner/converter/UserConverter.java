package com.example.travelplanner.converter;


import com.example.travelplanner.dto.UserDTO;

import com.example.travelplanner.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter  extends AbstractConverter<User, UserDTO>{

    @Override
    public User toEntity(UserDTO userDTO) {
        User user = null;
        if (userDTO != null) {
            user = new User(userDTO.getId_user(),userDTO.getEmail(), userDTO.getPassword(),userDTO.getPhone(), userDTO.getUsername());
        }
        return user;
    }

    @Override
    public UserDTO toDTO(User user) {
        UserDTO userDTO = null;
        if (user != null) {
            userDTO = new UserDTO(user.getId_user(),user.getEmail(), user.getPassword(),user.getPhone(), userDTO.getUsername());
        }
        return userDTO;
    }

}
