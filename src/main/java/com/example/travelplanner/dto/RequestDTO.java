package com.example.travelplanner.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idRequest", scope = UserDTO.class)
public class RequestDTO {


    private long idRequest;
    private String type;

    private Date date;

    private boolean state;

    private String historical;

    private ManagerDTO idManager;

    private UserDTO iduser;


}
