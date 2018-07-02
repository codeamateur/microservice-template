package com.zjx.dev.template.account.service;

import com.zjx.dev.template.account.domain.dto.AccountDto;
import com.zjx.dev.template.account.domain.dto.UserDto;

public interface AccountService {

	/**
	 * Finds account by given name
	 *
	 * @param accountName
	 * @return found account
	 */
	AccountDto findByName(String accountName);

	UserDto getAccountByName(String accountName);

}
