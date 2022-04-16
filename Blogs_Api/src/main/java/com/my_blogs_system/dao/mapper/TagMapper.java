package com.my_blogs_system.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my_blogs_system.dao.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
