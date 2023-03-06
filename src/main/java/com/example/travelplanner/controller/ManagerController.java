package com.example.travelplanner.controller;

import com.example.travelplanner.dto.LoginDTO;
import com.example.travelplanner.dto.ManagerDTO;
import com.example.travelplanner.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "manager")

public class ManagerController extends AbstractController<ManagerDTO> {

   @Autowired
    private ManagerService managerService;

    @PostMapping(value = "/login")
    public ManagerDTO login(@RequestBody LoginDTO loginDTO) {
        return managerService.findByUsernameAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
    }




}
