package com.example.travelplanner.service;

import com.example.travelplanner.dao.UserRepository;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.mapper.UserMapper;
import com.example.travelplanner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserMapper userMapper = UserMapper.INSTANCE;


    @Autowired
    private UserRepository repository;

    public UserDTO findByEmailAndPassword(String email, String password) {
        return userMapper.toDto(repository.findByEmailAndPassword(email, password));
    }

    public UserDTO register(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        User cprSalvata = repository.save(user);
        return userMapper.toDto(cprSalvata);
    }

}