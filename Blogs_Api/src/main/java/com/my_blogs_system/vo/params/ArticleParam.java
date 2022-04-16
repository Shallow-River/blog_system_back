package com.my_blogs_system.vo.params;

import com.my_blogs_system.vo.CategoryVo;
import com.my_blogs_system.vo.TagVo;
import lombok.Data;

import java.util.List;


@Data
public class ArticleParam {

    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;
}
