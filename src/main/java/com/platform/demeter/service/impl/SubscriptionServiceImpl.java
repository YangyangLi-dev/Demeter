package com.platform.demeter.service.impl;

import com.platform.demeter.dao.entity.SubscriptionEntity;
import com.platform.demeter.dao.entity.UserEntity;
import com.platform.demeter.dao.repository.SubscriptionRepository;
import com.platform.demeter.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
  @Autowired private SubscriptionRepository subscriptionRepository;

  public void subscribe(UserEntity user, SubscriptionEntity subscription) {
    subscription.setUser(user);
    subscriptionRepository.save(subscription);
  }
}
