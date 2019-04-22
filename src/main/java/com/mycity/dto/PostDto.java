package com.mycity.dto;


import com.mycity.entity.BaseEntity;
import com.mycity.entity.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by erman.payasli on 22.04.2019
 */

@Data
public class PostDto
{
    private Long id;
    private String title;
    private String description;
    private UserDto user;
    private Date date;


}
