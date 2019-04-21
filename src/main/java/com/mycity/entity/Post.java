package com.mycity.entity;


import com.mycity.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by erman.payasli on 21.04.2019
 */

@Entity
@Table(name = "T_POST")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Post extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE",length = 100,unique = true)
    private String title;

    @Column(name = "DESCRIPTION",length = 1000)
    private String description;

    @JoinColumn(name = "POSTED_USER_ID")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User user;

}
