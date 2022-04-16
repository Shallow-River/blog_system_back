package com.my_blogs_system.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my_blogs_system.dao.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
