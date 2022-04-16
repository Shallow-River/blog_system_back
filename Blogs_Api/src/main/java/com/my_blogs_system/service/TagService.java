package com.my_blogs_system.service;

import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.TagVo;

import java.util.List;
public interface TagService {
    Result hots(int limit);

    List<TagVo> findTagsByArticleId(Long articleId);

    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long Id);
}
