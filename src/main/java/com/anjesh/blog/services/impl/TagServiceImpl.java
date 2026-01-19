package com.anjesh.blog.services.impl;

import com.anjesh.blog.domain.entities.Tag;
import com.anjesh.blog.repositories.TagRepository;
import com.anjesh.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }
}
