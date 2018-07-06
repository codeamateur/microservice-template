package com.zjx.dev.template.order.service.impl;

import com.zjx.dev.template.order.client.AccountServiceClient;
import com.zjx.dev.template.order.domain.dto.OrderDto;
import com.zjx.dev.template.order.domain.dto.UserDto;
import com.zjx.dev.template.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService{

    @Autowired
    private AccountServiceClient accountServiceClient;

    @Override
    public OrderDto getOrderDemo(String userName) {
        UserDto userDto = accountServiceClient.getAccountByName(userName);
        return new OrderDto(1,userDto.getId(),userDto.getUsername(),"demo",new BigDecimal(1.11),3,new Date());
    }
}
