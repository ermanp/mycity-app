package com.mycity.repository;

import com.mycity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by erman.payasli on 22.04.2019
 */


public interface UserRepository extends JpaRepository<User,Long>
{


}
