package com.example.sleuthdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class SleuthdemoApplication {

    private static final Logger LOG=Logger.getLogger(SleuthdemoApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(SleuthdemoApplication.class, args);
    }

}
