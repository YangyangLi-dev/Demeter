package com.platform.demeter.service.impl;

import com.platform.demeter.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

  @Autowired private AuthenticationManager authenticationManager;

  public void login(String email, String password) {
    Authentication authentication =
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(email, password));
    SecurityContextHolder.getContext().setAuthentication(authentication);
  }

  public void logout() {
    SecurityContextHolder.getContext().setAuthentication(null);
  }
}
