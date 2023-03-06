package com.example.travelplanner.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idanager", scope = ManagerDTO.class)
public class ManagerDTO {

    private long idManager;

    private String username;

    private String password;

    private String email;

    private String country;

}
