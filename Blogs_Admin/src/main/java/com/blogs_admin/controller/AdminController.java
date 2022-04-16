package com.blogs_admin.controller;

import com.blogs_admin.model.params.PageParam;
import com.blogs_admin.pojo.Permission;
import com.blogs_admin.service.PermissionService;
import com.blogs_admin.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private PermissionService permissionService;

    @PostMapping("permission/permissionList")
    public Result listPermission(@RequestBody PageParam pageParam){return permissionService.listPermission(pageParam);}

    @PostMapping("permission/add")
    public Result addPermission(@RequestBody Permission permission){return permissionService.addPermission(permission);}

    @PostMapping("permission/update")
    public Result updatePermission(@RequestBody Permission permission){return permissionService.updatePermission(permission);}

    @GetMapping("permission/delete/{id}")
    public Result deletePermission(@PathVariable("id") Long id){return permissionService.deletePermission(id);}
}
