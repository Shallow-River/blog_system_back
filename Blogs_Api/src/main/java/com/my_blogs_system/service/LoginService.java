package com.my_blogs_system.service;

import com.my_blogs_system.dao.pojo.SysUser;
import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.params.LoginParam;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginService {
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParam loginParam);
}
