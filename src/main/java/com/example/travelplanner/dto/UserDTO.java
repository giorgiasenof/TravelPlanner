package com.example.travelplanner.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    private long idUser;

    private String email;

    private String password;

    private int phone;

}
