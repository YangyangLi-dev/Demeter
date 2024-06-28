package com.platform.demeter.vo.request.user;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserLoginRequestVo {
  @NotEmpty private String email;
  @NotEmpty private String password;
}
