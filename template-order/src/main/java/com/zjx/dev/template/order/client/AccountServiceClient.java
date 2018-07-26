package com.zjx.dev.template.order.client;


import com.zjx.dev.template.order.client.hystrix.AccountServiceClientHystrix;
import com.zjx.dev.template.order.domain.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "account-service",fallback = AccountServiceClientHystrix.class)
public interface AccountServiceClient {

	@GetMapping(value = "/{accountName}")
	UserDto getAccountByName(@PathVariable("accountName") String accountName);

}
