package com.platform.demeter.vo.request.food;

import java.util.Date;
import lombok.Data;

@Data
public class FoodItemUpdateVo {
    private Integer quantity;
    private Date expirationDate;
}
