package com.example.travelplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ManagerDTO {

    private long id;

    private String username;

    private String password;

    private String email;

    private String country;
}
