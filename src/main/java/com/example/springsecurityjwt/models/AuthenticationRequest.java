package com.example.springsecurityjwt.models;


import lombok.Data;

@Data
public class AuthenticationRequest {

    private String username;
    private String password;
}
