package com.platform.demeter.controller;

import com.platform.demeter.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/org")
public class CharitableOrganizationController {
  @Autowired private FoodItemService foodItemService;

  @GetMapping(path = "/food/list/donation")
  public void listFoodForDonation() {
    foodItemService.listFoodForDonation();
  }

  /**
   * claim the food item listed by retailers available for donation the retailer inventory must be
   * updated accordingly once a particular food item is claimed by a Charitable Organization
   */
  @PutMapping(path = "/food/claim")
  public void claimFood() {
    foodItemService.claimFood();
  }
}
