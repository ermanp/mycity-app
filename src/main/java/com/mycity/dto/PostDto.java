package com.mycity.dto;


import com.mycity.entity.BaseEntity;
import com.mycity.entity.User;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by erman.payasli on 22.04.2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto
{
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String description;
    private UserDto user;
    private Date date;


}
