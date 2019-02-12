package com.codecool.owndictionary.Model;

import javax.persistence.*;

@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long wordId;

    private String hungarian;
    private String foreign;
    private String language;

    @OneToMany
    private long userId;
    private String month;


}
