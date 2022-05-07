package com.serein.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.serein.blog.dao.pojo.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper extends BaseMapper<Comment> {
}
