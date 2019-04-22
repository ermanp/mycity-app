package com.mycity.service;

import com.mycity.entity.Post;
import com.mycity.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by erman.payasli on 22.04.2019
 */


public interface UserService
{
    User save(User post);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);
}
