package com.codecool.owndictionary.Controller;

import com.codecool.owndictionary.DAO.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WordController {

    @Autowired
    WordService wordService;
}
