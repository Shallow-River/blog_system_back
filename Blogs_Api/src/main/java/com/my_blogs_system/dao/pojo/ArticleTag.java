package com.my_blogs_system.dao.pojo;

import lombok.Data;

@Data
public class ArticleTag {
    private Long id;

    private Long articleId;

    private Long tagId;
}
