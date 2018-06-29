package com.zjx.dev.template.order.controller;

import com.zjx.dev.template.order.domain.dto.OrderDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;


@RestController
@Api(tags = "订单管理")
public class OrderController {

    @GetMapping("/demo")
    @PreAuthorize("hasAuthority('demo:query')")
    @ApiOperation("订单明细")
    public OrderDto order() {
        return new OrderDto(1,"demo",new BigDecimal(1.11),3,new Date());
    }
}
