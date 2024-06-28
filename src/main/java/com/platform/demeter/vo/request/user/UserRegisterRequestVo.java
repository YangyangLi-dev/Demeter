package com.platform.demeter.vo.request.user;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserRegisterRequestVo {
  @NotEmpty private String name;
  @NotEmpty private String email;
  @NotEmpty private String password;
  @NotEmpty private String confirmPassword;
  private Integer userType;
}
