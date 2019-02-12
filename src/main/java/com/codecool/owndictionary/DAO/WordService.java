package com.codecool.owndictionary.DAO;

import com.codecool.owndictionary.Repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class WordService {

    @Autowired
    WordRepository wordRepository;

}
