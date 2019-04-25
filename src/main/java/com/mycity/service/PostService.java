package com.mycity.service;

import com.mycity.dto.PostDto;
import com.mycity.entity.Post;
import com.mycity.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by erman.payasli on 22.04.2019
 */


public interface PostService
{
    PostDto save(PostDto post);

    PostDto getById(Long id);

    TPage<PostDto> getAllPageable(Pageable pageable);

    Boolean delete(PostDto post);

    Boolean deleteById(Long id);

    PostDto update(Long id, PostDto post);
}
