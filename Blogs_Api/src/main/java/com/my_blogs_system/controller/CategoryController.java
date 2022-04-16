package com.my_blogs_system.controller;

import com.my_blogs_system.service.CategoryService;
import com.my_blogs_system.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//文章分类功能
@RestController
@RequestMapping("categorys")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Result categories(){
        return categoryService.findAll();
    }

    @GetMapping("detail")//展示文章分类
    public Result categoriesDetail(){
        return categoryService.findAllDetail();
    }


    @GetMapping("detail/{id}")//展示分类后的文章列表
    public Result categoryDetailById(@PathVariable("id") Long id){
        return categoryService.categoryDetailById(id);
    }
}
