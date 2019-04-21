package com.mycity.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by erman.payasli on 21.04.2019
 */

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable
{
    @Column(name = "CREATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(name = "CREATED_BY",length = 100)
    private String createdBy;

    @Column(name = "UPDATE_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @Column(name = "UPDATE_BY",length = 100)
    private String updatedBy;

    @Column(name = "STATUS")
    private Boolean status;

}
