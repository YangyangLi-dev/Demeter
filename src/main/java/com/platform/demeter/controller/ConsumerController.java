package com.platform.demeter.controller;

import com.platform.demeter.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/consumer")
public class ConsumerController {
  @Autowired private FoodItemService foodItemService;

  //    Consumers of the platform should be able to purchase (not real transaction)
  //    the items listed by the retailers at a given discount rate
  @GetMapping(path = "/food/list/discount")
  public void listFoodForDiscount() {
    // list food items for discount
    foodItemService.listFoodForDiscount();
  }
}
