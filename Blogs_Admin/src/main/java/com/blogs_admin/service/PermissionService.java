package com.blogs_admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blogs_admin.mapper.PermissionMapper;
import com.blogs_admin.model.params.PageParam;
import com.blogs_admin.pojo.Permission;
import com.blogs_admin.vo.PageResult;
import com.blogs_admin.vo.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    public Result listPermission(PageParam pageParam){
        Page<Permission> page = new Page<>(pageParam.getCurrentPage(), pageParam.getPageSize());
        LambdaQueryWrapper<Permission> queryWrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(pageParam.getQueryString())){
            queryWrapper.eq(Permission::getName, pageParam.getQueryString());
        }
        Page<Permission> permissionPage = permissionMapper.selectPage(page, queryWrapper);
        PageResult<Permission> pageResult = new PageResult<>();
        pageResult.setList(permissionPage.getRecords());
        pageResult.setTotal(permissionPage.getTotal());
        return Result.success(pageResult);
    }

    public Result addPermission(Permission permission){
        this.permissionMapper.insert(permission);
        return Result.success(null);
    }

    public Result updatePermission(Permission permission){
        this.permissionMapper.updateById(permission);
        return Result.success(null);
    }

    public Result deletePermission(Long id){
        this.permissionMapper.deleteById(id);
        return Result.success(null);
    }
}
