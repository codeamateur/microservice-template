package com.zjx.dev.template.order.client.hystrix;

import com.zjx.dev.template.order.client.AccountServiceClient;
import com.zjx.dev.template.order.domain.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceClientHystrix implements AccountServiceClient {

    @Override
    public UserDto getAccountByName(String accountName) {
        return new UserDto();
    }
}
