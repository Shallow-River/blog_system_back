package com.my_blogs_system.controller;

import com.my_blogs_system.service.LoginService;
import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping
    public Result login(@RequestBody LoginParam loginParam){
        return loginService.login(loginParam);
    }
}
