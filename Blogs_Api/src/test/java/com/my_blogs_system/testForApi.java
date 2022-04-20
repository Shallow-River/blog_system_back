package com.my_blogs_system;

import com.my_blogs_system.dao.mapper.ArticleMapper;
import com.my_blogs_system.dao.pojo.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class testForApi {
    @Resource
    private ArticleMapper articleMapper;

    @Test
    public void testGetArticle() throws Exception{
        Long id = 1L;
        Article article = articleMapper.selectById(id);
        System.out.println(article);
    }
}
