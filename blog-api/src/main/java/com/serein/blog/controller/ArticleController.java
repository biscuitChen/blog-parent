package com.serein.blog.controller;


import com.serein.blog.common.aop.LogAnnotation;
import com.serein.blog.common.cache.Cache;
import com.serein.blog.servicec.ArticleService;
import com.serein.blog.vo.Result;
import com.serein.blog.vo.params.ArticleParam;
import com.serein.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    //加上此注解代表要对此接口记录日志
    @LogAnnotation(module="文章",operator="获取文章列表")
    @Cache(expire = 5*60*1000,name = "listArticle")
    public Result listArticle(@RequestBody PageParams pageParams){

        return  articleService.listArticle(pageParams);
    }

    /**
     * 首页 最热文章
     * @param
     * @return
     */
    @PostMapping("hot")
    @Cache(expire = 5*60*1000,name = "hot_article")
    public Result hotArticle(){
        int limit = 5;
        return  articleService.hotArticle(limit);
    }

    /**
     * 最新文章
     * @return
     */
    @PostMapping("new")
    @Cache(expire = 5*60*1000,name = "news_article")
    public Result newArticles(){
        int limit = 5;
        return  articleService.newArticles(limit);
    }


    /**
     * 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives(){
        return  articleService.listArchives();
    }


    @PostMapping("/view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId){
        return articleService.findArticleById(articleId);
    }


    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){

        return articleService.publish(articleParam);
    }
}
