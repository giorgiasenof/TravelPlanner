package com.example.travelplanner.converter;

import com.example.travelplanner.dto.ManagerDTO;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.model.Manager;
import com.example.travelplanner.model.User;
import org.springframework.stereotype.Component;

@Component
public class ManagerConverter extends AbstractConverter<Manager, ManagerDTO> {

    @Override
    public Manager toEntity(ManagerDTO managerDTO) {
        Manager manager = null;
        if (managerDTO != null) {
            manager = new Manager(managerDTO.getId(),managerDTO.getUsername(),managerDTO.getPassword(), managerDTO.getCountry(), managerDTO.getEmail());
        }
        return manager;
    }

    @Override
    public ManagerDTO toDTO(Manager manager) {
        ManagerDTO managerDTO = null;
        if (manager != null) {
            managerDTO = new ManagerDTO(manager.getId(), manager.getUsername(),manager.getPassword(), manager.getEmail(),manager.getCountry());
        }
        return managerDTO;
    }
}
