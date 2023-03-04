package com.example.travelplanner.service;

import com.example.travelplanner.dao.ManagerRepository;
import com.example.travelplanner.dao.UserRepository;
import com.example.travelplanner.dto.ManagerDTO;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.mapper.ManagerMapper;
import com.example.travelplanner.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    ManagerMapper managerMapper = ManagerMapper.MINSTANCE;
    @Autowired
    private ManagerRepository repository;

    public ManagerDTO findByUsernameAndPassword(String username, String password) {
        return managerMapper.toDto(repository.findByUsernameAndPassword(username, password));
    }
}
