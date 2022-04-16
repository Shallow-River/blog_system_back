package com.my_blogs_system.controller;

import com.my_blogs_system.cache.Cache;
import com.my_blogs_system.common.aop.LogAnnotation;
import com.my_blogs_system.service.ArticleService;
import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.params.ArticleParam;
import com.my_blogs_system.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping
    @LogAnnotation(module="文章", operator="获取文章列表")
    @Cache(expire = 10 * 60 * 1000, name = "list_article") // 缓存10分钟
    public Result listArticle(@RequestBody PageParams pageParams){
        return articleService.listArticle(pageParams);
    }

    @PostMapping("hot")
    @Cache(expire = 10 * 60 * 1000, name = "hot_article") // 缓存10分钟
    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    @PostMapping("new")
    @Cache(expire = 10 * 60 * 1000, name = "new_article") // 缓存10分钟
    public Result newArticles(){
        int limit = 5;
        return articleService.newArticles(limit);
    }

    @PostMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId){
        return articleService.findArticleById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }
}