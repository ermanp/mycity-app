package com.mycity.dto;


import com.mycity.entity.BaseEntity;
import com.mycity.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "Post Data Transfer Object")
public class PostDto
{
    @ApiModelProperty(value = "Post ID")
    private Long id;
    @NotNull
    @ApiModelProperty(required = true,value = "Title of Post")
    private String title;
    @NotNull
    @ApiModelProperty(required = true,value = "Description of Post")
    private String description;
    private UserDto user;
    @ApiModelProperty(required = true,value = "Date of Post")
    private Date date;


}
