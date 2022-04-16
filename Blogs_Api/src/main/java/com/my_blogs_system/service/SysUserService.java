package com.my_blogs_system.service;

import com.my_blogs_system.dao.pojo.SysUser;
import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.UserVo;

public interface SysUserService {
    SysUser findUser(String account, String password);

    SysUser findUserById(Long id);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long id);
}
