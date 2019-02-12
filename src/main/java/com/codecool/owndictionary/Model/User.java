package com.codecool.owndictionary.Model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private long userId;

    private String email;
    private String userName;
    private String password;

}
