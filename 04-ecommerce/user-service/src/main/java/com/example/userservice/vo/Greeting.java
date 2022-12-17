package com.example.userservice.vo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class Greeting {
    // yml file 의 greeting value를 가져오려고 함
    @Value("${greeting.message}")
    private String message;
}
