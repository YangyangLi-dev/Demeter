package com.platform.demeter.dao.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "food_item")
public class FoodItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "retailer_id", nullable = false)
    private UserEntity retailer;

    private String name;

    private String description;

    private Integer quantity;

    private double price;

    private double discountedPrice;

    private Date expirationDate;

    private Boolean isSurplus;

    private Boolean isForDonation;
}