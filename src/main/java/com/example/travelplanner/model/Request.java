package com.example.travelplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "requests")

public class Request{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_request;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User id_user;
    @ManyToOne
    @JoinColumn(name = "id_manager", referencedColumnName = "id_manager")
    private Manager id_manager;

    @Column(unique = true)
    private String type;

    private Date date;

    private String historical;

    private boolean state;




}