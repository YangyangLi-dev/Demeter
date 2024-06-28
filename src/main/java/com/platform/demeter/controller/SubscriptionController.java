package com.platform.demeter.controller;

import com.platform.demeter.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/subscription")
public class SubscriptionController {
  @Autowired private SubscriptionService subscriptionService;

  /**
   * Whenever retailers list surplus food items on the platform, users subscribed to alerts receive
   * automatic notifications via email or phone
   */
  @PostMapping(path = "/subscribe")
  public void subscribe() {
    subscriptionService.subscribe();
  }
}
