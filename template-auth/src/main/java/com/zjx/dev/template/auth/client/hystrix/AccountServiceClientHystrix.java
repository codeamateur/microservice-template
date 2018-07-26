package com.zjx.dev.template.auth.client.hystrix;

import com.zjx.dev.template.auth.client.AccountServiceClient;
import com.zjx.dev.template.auth.domain.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceClientHystrix implements AccountServiceClient {
    @Override
    public UserDto getAccountByName(String accountName) {
        return null;
    }
}
