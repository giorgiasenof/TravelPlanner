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
    private long idRequest;

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private User idUser;
    @ManyToOne
    @JoinColumn(name = "idManager", referencedColumnName = "idManager")
    private Manager idManager;

    @Column(unique = true)
    private String type;

    private Date date;

    private String historical;

    private boolean state;




}