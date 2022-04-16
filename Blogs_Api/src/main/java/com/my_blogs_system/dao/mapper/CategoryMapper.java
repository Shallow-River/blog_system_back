package com.my_blogs_system.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my_blogs_system.dao.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
    
}
