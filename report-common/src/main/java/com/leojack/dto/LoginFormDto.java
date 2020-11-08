package com.leojack.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginFormDto {

    private String username;

    private String password;

    private String pin;

}
