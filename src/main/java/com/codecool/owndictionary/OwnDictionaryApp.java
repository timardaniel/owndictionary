package com.codecool.owndictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OwnDictionaryApp {

    public static void main(String[] args) {
        SpringApplication.run(OwnDictionaryApp.class, args);
        int x = 5;
        while(x > 0){
            System.out.println("Spring running  " + x);
            x--;
        }
    }

}
