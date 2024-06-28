package com.platform.demeter.service.impl;

import com.platform.demeter.dao.repository.FoodItemRepository;
import com.platform.demeter.service.FoodItemService;
import com.platform.demeter.vo.request.food.FoodItemCreateVo;
import com.platform.demeter.vo.request.food.FoodItemUpdateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemServiceImpl implements FoodItemService {
    @Autowired private FoodItemRepository foodItemRepository;
    @Override
    public void updateFoodItem(FoodItemUpdateVo foodItemUpdateVo) {

    }

    @Override
    public void createFoodItem(FoodItemCreateVo foodItemCreateVo) {

    }

    @Override
    public void surplusFood() {

    }

    @Override
    public void listSurplusFood() {

    }

    @Override
    public void claimFood() {

    }

    @Override
    public void listFoodForDonation() {

    }

    @Override
    public void listFoodForDiscount() {

    }
}
