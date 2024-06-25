package com.platform.demeter.controller;

import com.platform.demeter.vo.request.UserRegisterRequestVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/user")
public class UserController {
    //register
    @PostMapping(path="/register")
    public void register(@RequestBody UserRegisterRequestVo userRegisterRequestVo){
        //register
    }
    //login
    //logout

}
