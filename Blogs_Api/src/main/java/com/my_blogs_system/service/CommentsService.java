package com.my_blogs_system.service;

import com.my_blogs_system.vo.Result;
import com.my_blogs_system.vo.params.CommentParam;

public interface CommentsService {
    Result commentsByArticleId(Long id);

    Result comments(Long id);

    Result comment(CommentParam commentParam);
}
