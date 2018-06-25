package com.zjx.dev.template.order.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @RequestMapping("/demo")
    @PreAuthorize("hasAuthority('query-demo')")
    public String order() {
        return "order";
    }
}
