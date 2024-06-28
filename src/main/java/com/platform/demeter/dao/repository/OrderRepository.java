package com.platform.demeter.dao.repository;

import com.platform.demeter.dao.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {}
