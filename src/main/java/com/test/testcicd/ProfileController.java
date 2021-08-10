package com.test.testcicd;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequiredArgsConstructor
@RestController
public class ProfileController {
    private final Environment env;

    @Value("${abc}")
    private String prodVal;

    @GetMapping("/abc")
    public String getProdProfile(){
        return prodVal;
    }

    @GetMapping("/profile")
    public String getProfile () {
        return Arrays.stream(env.getDefaultProfiles())
                .findFirst()
                .orElse("");
    }
}