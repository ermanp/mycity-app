package com.mycity.entity;


import com.mycity.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by erman.payasli on 21.04.2019
 */

@Entity
@Table(name = "T_USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USER_NAME",length = 100,unique = true)
    private String username;

    @Column(name = "PASSWORD",length = 200)
    private String password;

    @Column(name = "NAME_SURNAME",length = 200)
    private String nameSurname;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @JoinColumn(name = "POSTED_USER_ID")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> postList;



}
