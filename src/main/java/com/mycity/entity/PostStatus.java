package com.mycity.entity;


import lombok.*;

import javax.persistence.*;

/**
 * Created by erman.payasli on 22.04.2019
 */

public enum PostStatus
{
    OPEN,
    CLOSED,
    IN_REVIEW,
    IN_PROGRESS,
    RESOLVED

}
