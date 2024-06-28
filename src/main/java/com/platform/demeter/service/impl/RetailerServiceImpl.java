package com.platform.demeter.service.impl;

import com.platform.demeter.dao.entity.FoodItemEntity;
import com.platform.demeter.dao.entity.UserEntity;
import com.platform.demeter.dao.repository.FoodItemRepository;
import com.platform.demeter.service.RetailerService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerServiceImpl implements RetailerService {
    @Autowired
    private FoodItemRepository foodItemRepository;

    public void addFoodItem(UserEntity retailer, FoodItemEntity foodItem){
        foodItem.setRetailer(retailer);
        foodItemRepository.save(foodItem);
    }

    public void updateFoodItem(FoodItemEntity foodItem){
        foodItemRepository.save(foodItem);
    }

    public List<FoodItemEntity> identifySurplusFoodItems(UserEntity retailer){
        Date oneWeekFromNow = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000);
        return null;
//        return foodItemRepository.findByRetailerAndExpirationDateBefore(retailer, oneWeekFromNow)
//                .stream()
//                .peek(item -> item.setIsSurplus(true))
//                .collect(Collectors.toList());
    }

    public List<FoodItemEntity> listSurplusFoodItems(UserEntity retailer){
        return null;
//        return foodItemRepository.findByRetailerAndIsSurplus(retailer, true);
    }
}