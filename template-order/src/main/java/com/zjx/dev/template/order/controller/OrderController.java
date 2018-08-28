package com.zjx.dev.template.order.controller;

import com.zjx.dev.template.order.domain.dto.OrderDto;
import com.zjx.dev.template.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
@Api(tags = "订单管理")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/demo")
    @PreAuthorize("hasAuthority('demo:query')")
    @ApiOperation("订单明细")
    public OrderDto order(Principal principal) {
        log.info("获取订单明细");
        return orderService.getOrderDemo(principal.getName());
    }
}
