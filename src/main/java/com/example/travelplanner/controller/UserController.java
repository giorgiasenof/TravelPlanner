package com.example.travelplanner.controller;

import com.example.travelplanner.dao.UserRepository;
import com.example.travelplanner.dto.LoginDTO;
import com.example.travelplanner.exception.UserAlreadyExistsException;
import com.example.travelplanner.model.User;
import com.example.travelplanner.dto.UserDTO;
import com.example.travelplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "user")

public class UserController extends AbstractController<UserDTO> {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/login")
        public UserDTO login(@RequestBody LoginDTO loginDTO) {
             return userService.findByEmailAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
        }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            userService.insert(user);
            return new ResponseEntity<>("User registrato con successo!", HttpStatus.CREATED);
        } catch (UserAlreadyExistsException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }







}


