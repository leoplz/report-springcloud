package com.leojack.controller;

import com.leojack.dto.LoginFormDto;
import com.leojack.utils.ReportResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @PostMapping("/login")
    public ReportResult LoginValidate(@RequestBody LoginFormDto loginFormDto) {

        System.out.println(loginFormDto);

        return ReportResult.success("认证成功!");

    }


}
