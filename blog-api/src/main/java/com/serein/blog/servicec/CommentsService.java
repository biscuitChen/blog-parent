package com.serein.blog.servicec;

import com.serein.blog.dao.pojo.CommentParam;
import com.serein.blog.vo.Result;

public interface CommentsService {
    /**
     * 根据文章id查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
