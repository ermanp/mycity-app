package com.mycity.repository;

import com.mycity.entity.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by erman.payasli on 22.04.2019
 */


public interface PostRepository extends JpaRepository<Post,Long>
{
    @Override
    List<Post> findAll(Sort sort);
}
