package com.anjesh.blog.services;

import com.anjesh.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listCategories();
    Category createCategory(Category category);

}
