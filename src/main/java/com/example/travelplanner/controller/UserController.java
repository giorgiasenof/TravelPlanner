package com.example.travelplanner.controller;

import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "user")
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
        public UserDTO login(@RequestParam String email, String password) {
             return userService.findByEmailAndPassword(email, password);
        }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO) {
        UserDTO userNew = userService.register(userDTO);
        return ResponseEntity.ok(userNew);
    }




}


