package com.serein.blog.servicec;

import com.serein.blog.vo.CategoryVo;
import com.serein.blog.vo.Result;

import java.util.List;

public interface CategoryService {

    CategoryVo finCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
