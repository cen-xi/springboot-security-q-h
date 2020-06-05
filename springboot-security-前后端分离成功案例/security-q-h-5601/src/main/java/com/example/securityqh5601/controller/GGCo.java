package com.example.securityqh5601.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GGCo {

    //获取用户权限信息
    @RequestMapping({"/info"})
    //开启跨域
    // [普通跨域]
    //@CrossOrigin
    //[spring security 跨域]
    @CrossOrigin(allowCredentials="true",allowedHeaders="*")
    @ResponseBody
    public Object info(@AuthenticationPrincipal Principal principal) {
        return principal;
    }
}
