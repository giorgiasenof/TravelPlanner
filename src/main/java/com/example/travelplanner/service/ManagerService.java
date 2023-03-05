package com.example.travelplanner.service;

import com.example.travelplanner.converter.ManagerConverter;
import com.example.travelplanner.dao.ManagerRepository;
import com.example.travelplanner.dao.UserRepository;
import com.example.travelplanner.dto.ManagerDTO;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.mapper.ManagerMapper;
import com.example.travelplanner.mapper.UserMapper;

import com.example.travelplanner.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService extends AbstractService<Manager, ManagerDTO> {

   // ManagerMapper managerMapper = ManagerMapper.MINSTANCE;
    @Autowired
    private ManagerRepository repository;

    @Autowired
    private ManagerConverter converter;


    public ManagerDTO findByUsernameAndPassword(String username, String password) {
        return converter.toDTO(repository.findByUsernameAndPassword(username, password));
    }
}
