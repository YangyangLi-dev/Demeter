package com.platform.demeter.service;

import com.platform.demeter.vo.request.food.FoodItemCreateVo;
import com.platform.demeter.vo.request.food.FoodItemUpdateVo;

public interface FoodItemService {
  void updateFoodItem(FoodItemUpdateVo foodItemUpdateVo);

  void createFoodItem(FoodItemCreateVo foodItemCreateVo);

  void surplusFood();

  void listSurplusFood();

  void claimFood();

  void listFoodForDonation();

  void listFoodForDiscount();
}
