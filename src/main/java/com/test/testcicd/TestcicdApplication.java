package com.test.testcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestcicdApplication {
    public static void main(String[] args) {
        if(System.getProperty("spring.profiles.default")==null){
            System.setProperty("spring.profiles.default" , "test");
        }
        SpringApplication.run(TestcicdApplication.class, args);
    }
}
