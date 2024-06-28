package com.platform.demeter.controller;

import com.platform.demeter.service.AuthService;
import com.platform.demeter.service.UserService;
import com.platform.demeter.vo.request.user.UserLoginRequestVo;
import com.platform.demeter.vo.request.user.UserRegisterRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {
  @Autowired private UserService userService;
  @Autowired private AuthService authService;

  // register
  @PostMapping(path = "/register")
  public void register(@RequestBody @Validated UserRegisterRequestVo userRegisterRequestVo) {
    // register
    userService.register(userRegisterRequestVo);
  }

  @PostMapping(path = "/login")
  public void login(@RequestBody @Validated UserLoginRequestVo userLoginRequestVo) {
    authService.login(userLoginRequestVo.getEmail(), userLoginRequestVo.getPassword());
  }

  @PostMapping(path = "/logout")
  public void logout() {
    authService.logout();
  }
}
