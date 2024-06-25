package com.platform.demeter.dao.repository;

import com.platform.demeter.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
