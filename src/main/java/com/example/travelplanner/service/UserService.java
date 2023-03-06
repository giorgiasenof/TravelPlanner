package com.example.travelplanner.service;

import com.example.travelplanner.converter.UserConverter;
import com.example.travelplanner.dao.UserRepository;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.exception.UserAlreadyExistsException;
import com.example.travelplanner.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

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

    public User insert(User user) {
        if (repository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("User con email " + user.getEmail() + " esistente, inseriscine un altra!");
        }
        repository.save(user);
        return null;
    }

}
