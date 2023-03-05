package com.example.travelplanner.service;

import com.example.travelplanner.converter.UserConverter;
import com.example.travelplanner.dao.UserRepository;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserDTO> {
    //UserMapper userMapper = UserMapper.INSTANCE;


    @Autowired
    private UserRepository repository;

    @Autowired
    private UserConverter converter;

    public UserDTO findByEmailAndPassword(String email, String password) {
        return converter.toDTO(repository.findByEmailAndPassword(email, password));
    }

    public UserDTO insert(UserDTO userDTO) {
        User user = converter.toEntity(userDTO);
        User userSalvata = repository.save(user);
        return converter.toDTO(userSalvata);
    }

}