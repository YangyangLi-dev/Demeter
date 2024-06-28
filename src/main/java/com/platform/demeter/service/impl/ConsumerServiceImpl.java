package com.platform.demeter.service.impl;

import com.platform.demeter.dao.entity.FoodItemEntity;
import com.platform.demeter.dao.repository.FoodItemRepository;
import com.platform.demeter.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsumerServiceImpl implements ConsumerService {
  @Autowired private FoodItemRepository foodItemRepository;

  public void purchaseFoodItem(FoodItemEntity foodItem) {
    foodItemRepository.delete(foodItem);
  }
}
