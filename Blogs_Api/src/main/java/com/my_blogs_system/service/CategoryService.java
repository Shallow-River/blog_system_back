package com.my_blogs_system.service;

import com.my_blogs_system.vo.CategoryVo;
import com.my_blogs_system.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
