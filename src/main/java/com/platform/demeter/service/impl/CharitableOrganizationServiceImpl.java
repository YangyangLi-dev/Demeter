package com.platform.demeter.service.impl;

import com.platform.demeter.dao.entity.FoodItemEntity;
import com.platform.demeter.dao.entity.UserEntity;
import com.platform.demeter.dao.repository.FoodItemRepository;
import com.platform.demeter.service.CharitableOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;

public class CharitableOrganizationServiceImpl implements CharitableOrganizationService {
  @Autowired private FoodItemRepository foodItemRepository;

  public void claimFoodItem(UserEntity organization, FoodItemEntity foodItem) {
    foodItemRepository.save(foodItem);
  }
}
