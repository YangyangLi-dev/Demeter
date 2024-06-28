package com.platform.demeter.controller;

import com.platform.demeter.service.FoodItemService;
import com.platform.demeter.vo.request.food.FoodItemCreateVo;
import com.platform.demeter.vo.request.food.FoodItemUpdateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/retailer")
public class RetailerController {
  @Autowired private FoodItemService foodItemService;

  /**
   * Inventory Management 1. Retailers must have the capability to manage their inventory of food
   * items, including, updating quantities, and setting expiration dates for each item.
   */
  @PutMapping(path = "/food/update")
  public void updateFood(@RequestBody FoodItemUpdateVo foodItemUpdateVo) {
    // update food item
    foodItemService.updateFoodItem(foodItemUpdateVo);
  }

  /** Inventory Management 2. adding new food items */
  @PostMapping(path = "/food/new")
  public void createFood(@RequestBody FoodItemCreateVo foodItemCreateVo) {
    // create food item
    foodItemService.createFoodItem(foodItemCreateVo);
  }

  /** identify and flag surplus food items that are nearing expiration */
  @PutMapping(path = "/food/surplus")
  public void surplusFood() {
    foodItemService.surplusFood();
  }

  @GetMapping(path = "/food/list/surplus")
  public void listSurplusFood() {
    foodItemService.listSurplusFood();
  }
}
