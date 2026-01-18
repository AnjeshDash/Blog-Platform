package com.anjesh.blog.services;

import com.anjesh.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {

    List<Category> listCategories();
    Category createCategory(Category category);

    void deleteCategory(UUID id);

}
