package com.platform.demeter.service;

public interface AuthService {
  void login(String email, String password);

  void logout();
}
