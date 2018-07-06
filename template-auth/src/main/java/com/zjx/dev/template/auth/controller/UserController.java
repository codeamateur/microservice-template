package com.zjx.dev.template.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Slf4j
public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        log.info("Principal user implementation class:"+ user.getClass().getName());
        return user;
    }
}
