package com.platform.demeter.vo.request.food;

import java.util.Date;
import lombok.Data;

@Data
public class FoodItemCreateVo {
    private String name;

    private String description;

    private Integer quantity;

    private double price;

    private double discountedPrice;

    private Date expirationDate;

}
