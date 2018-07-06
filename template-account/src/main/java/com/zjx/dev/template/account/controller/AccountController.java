package com.zjx.dev.template.account.controller;

import com.zjx.dev.template.account.domain.dto.AccountDto;
import com.zjx.dev.template.account.domain.dto.UserDto;
import com.zjx.dev.template.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public AccountDto getCurrentAccount(Principal principal) {
		return accountService.findByName(principal.getName());
	}

	@PreAuthorize("#oauth2.hasScope('server')")
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public UserDto getAccountByName(@PathVariable String name) {
		return accountService.getAccountByName(name);
	}

}
