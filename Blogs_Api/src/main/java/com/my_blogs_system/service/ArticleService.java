package com.my_blogs_system.service;

import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.params.ArticleParam;
import com.my_blogs_system.vo.params.PageParams;

public interface ArticleService {
    Result listArticle(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticles(int limit);

    Result listArchives();

    Result findArticleById(Long articleId);

    Result publish(ArticleParam articleParam);
}
