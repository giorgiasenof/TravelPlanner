package com.example.travelplanner.converter;

import com.example.travelplanner.dto.ManagerDTO;

import com.example.travelplanner.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ManagerConverter extends AbstractConverter<Manager, ManagerDTO>{


    @Override
    public Manager toEntity(ManagerDTO managerDTO) {
        Manager manager = null;
        if (managerDTO != null)
            manager = new Manager(managerDTO.getId_manager(), managerDTO.getUsername(), managerDTO.getPassword(), managerDTO.getCountry(),managerDTO.getEmail());
        return manager;
    }


    @Override
    public ManagerDTO toDTO(Manager manager) {
        ManagerDTO managerDTO = null;
        if (manager != null) {
            managerDTO = new ManagerDTO(manager.getId_manager(), manager.getUsername(), manager.getPassword(), manager.getCountry(), manager.getEmail());
        }
        return managerDTO;
    }
}
