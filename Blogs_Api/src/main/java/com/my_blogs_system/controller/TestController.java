package com.my_blogs_system.controller;

import com.my_blogs_system.dao.pojo.SysUser;
import com.my_blogs_system.utils.UserThreadLocal;
import com.my_blogs_system.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}