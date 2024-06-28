package com.platform.demeter.service.impl;

import com.platform.demeter.dao.repository.UserRepository;
import com.platform.demeter.service.UserService;
import com.platform.demeter.vo.request.user.UserRegisterRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired private UserRepository userRepository;

  @Override
  public void register(UserRegisterRequestVo userRegisterRequestVo) {}
}
