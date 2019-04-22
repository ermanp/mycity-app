package com.mycity.service.impl;

import com.mycity.entity.Post;
import com.mycity.entity.User;
import com.mycity.repository.PostRepository;
import com.mycity.repository.UserRepository;
import com.mycity.service.PostService;
import com.mycity.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by erman.payasli on 22.04.2019
 */

@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id)
    {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable)
    {
        return userRepository.findAll(pageable);
    }
}
