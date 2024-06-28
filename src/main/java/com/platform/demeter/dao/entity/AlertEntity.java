package com.platform.demeter.dao.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alert")
public class AlertEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private FoodItemEntity foodItemEntity;

    private Integer type;

    private Timestamp alertTime;
}
