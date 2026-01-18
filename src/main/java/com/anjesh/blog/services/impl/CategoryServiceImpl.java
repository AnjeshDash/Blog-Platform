package com.anjesh.blog.services.impl;

import com.anjesh.blog.domain.entities.Category;
import com.anjesh.blog.repositories.CategoryRepository;
import com.anjesh.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCounts();
    }
}
