package com.my_blogs_system.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my_blogs_system.dao.dos.Archives;
import com.my_blogs_system.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    IPage<Article> listArticle(Page<Article> page,
                               Long categoryId,
                               Long tagId,
                               String year,
                               String month);

    List<Archives> listArchives();
}
