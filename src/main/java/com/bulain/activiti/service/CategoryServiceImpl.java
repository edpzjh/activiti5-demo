package com.bulain.activiti.service;

import com.bulain.activiti.dao.CategoryMapper;
import com.bulain.activiti.model.Category;
import com.bulain.activiti.pojo.CategorySearch;
import com.bulain.common.dao.PagedMapper;
import com.bulain.common.service.PagedServiceImpl;

public class CategoryServiceImpl extends PagedServiceImpl<CategorySearch, Category> implements CategoryService {
    private CategoryMapper categoryMapper;
    
    protected PagedMapper<CategorySearch, Category> getPagedMapper() {
        return categoryMapper;
    }
    
    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

}
