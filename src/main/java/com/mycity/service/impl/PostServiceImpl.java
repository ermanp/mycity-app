package com.mycity.service.impl;

import com.mycity.dto.PostDto;
import com.mycity.entity.Post;
import com.mycity.repository.PostRepository;
import com.mycity.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by erman.payasli on 22.04.2019
 */

@Service
public class PostServiceImpl implements PostService
{
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper)
    {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PostDto save(PostDto post)
    {
        if (post.getDate() == null)
            throw new IllegalArgumentException("Post Date cannot be null");

        Post postDb = modelMapper.map(post, Post.class);
        postDb = postRepository.save(postDb);

        return modelMapper.map(postDb, PostDto.class);
    }

    @Override
    public PostDto getById(Long id)
    {
        return null;
    }

    @Override
    public Page<PostDto> getAllPageable(Pageable pageable)
    {
        return null;
    }

    @Override
    public Boolean delete(PostDto post)
    {
        return null;
    }
}
