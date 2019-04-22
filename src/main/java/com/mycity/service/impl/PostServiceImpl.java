package com.mycity.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycity.dto.PostDto;
import com.mycity.entity.Post;
import com.mycity.repository.PostRepository;
import com.mycity.service.PostService;
import com.mycity.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by erman.payasli on 22.04.2019
 */

@Service
public class PostServiceImpl implements PostService
{
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;
    private final ObjectMapper objectMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper, ObjectMapper objectMapper)
    {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
        this.objectMapper = objectMapper;
    }

    @Override
    public PostDto save(PostDto post)
    {
       /* if (post.getDate() == null)
            throw new IllegalArgumentException("Post Date cannot be null");
*/
        Post postDb = modelMapper.map(post, Post.class);
        postDb = postRepository.save(postDb);

        return modelMapper.map(postDb, PostDto.class);
    }

    @Override
    public PostDto getById(Long id)
    {
        Post p = postRepository.getOne(id);
        return modelMapper.map(p,PostDto.class);
    }

    @Override
    public TPage<PostDto> getAllPageable(Pageable pageable)
    {
        Page<Post> data = postRepository.findAll(pageable);

        TPage page = new TPage<PostDto>();
        PostDto[] dtos = modelMapper.map(data.getContent(), PostDto[].class);
        page.setStat(data, Arrays.asList(dtos));

        return page;
    }

    @Override
    public Boolean delete(PostDto post)
    {
        return null;
    }
}
