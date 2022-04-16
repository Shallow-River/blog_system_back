package com.blogs_admin.service;

import com.blogs_admin.pojo.Admin;
import com.blogs_admin.pojo.Permission;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AuthService {

    @Resource
    private AdminService adminService;

    public boolean auth(HttpServletRequest request, Authentication authentication){
        String requestURI = request.getRequestURI();
        Object principal = authentication.getPrincipal();
        if(principal == null || "anonymousUser".equals(principal)){
            return false;
        }
        UserDetails userDetails = (UserDetails) principal;
        String username = userDetails.getUsername();
        Admin admin = adminService.findAdminByUsername(username);
        if(admin == null){
            return false;
        }
        Long id = admin.getId();
        List<Permission> permissionList = this.adminService.findPermissionByAdminId(id);

        return false;
    }
}
