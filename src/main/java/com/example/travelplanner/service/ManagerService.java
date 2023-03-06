package com.example.travelplanner.service;

import com.example.travelplanner.converter.ManagerConverter;
import com.example.travelplanner.dao.ManagerRepository;
import com.example.travelplanner.dto.ManagerDTO;

import com.example.travelplanner.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class ManagerService extends AbstractService<Manager, ManagerDTO> {

   // ManagerMapper managerMapper = ManagerMapper.MINSTANCE;
    @Autowired
    private ManagerRepository repository;

    @Autowired
    private ManagerConverter managerConverter;


    public ManagerDTO findByUsernameAndPassword(String username, String password) {
        return managerConverter.toDTO(repository.findByUsernameAndPassword(username, password));
    }

}
