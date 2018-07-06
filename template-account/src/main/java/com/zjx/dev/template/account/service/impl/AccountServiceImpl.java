package com.zjx.dev.template.account.service.impl;

import com.zjx.dev.template.account.domain.dto.AccountDto;
import com.zjx.dev.template.account.domain.dto.UserDto;
import com.zjx.dev.template.account.domain.dto.UserMapper;
import com.zjx.dev.template.account.domain.entity.SysUserEntity;
import com.zjx.dev.template.account.repository.AccountRepository;
import com.zjx.dev.template.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.stream.Collectors;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountDto findByName(String accountName) {
		Assert.notNull(accountName,"用户名不为空");
		SysUserEntity userEntity = repository.findByUsername(accountName);
		return UserMapper.INSTANCE.entityToAccountDto(userEntity,userEntity.getRoleLists().stream().map(role -> role.getRoleName()).collect(Collectors.toList()),
				userEntity.getRoleLists().parallelStream().flatMap(role -> role.getMenuLists().stream().map(menu->menu.getPermission())).distinct().collect(Collectors.toList())
				);
	}

	@Override
	public UserDto getAccountByName(String accountName) {
		Assert.notNull(accountName,"用户名不为空");
		SysUserEntity userEntity = repository.findByUsername(accountName);
		return UserMapper.INSTANCE.entityToUserDto(userEntity,
				userEntity.getRoleLists().parallelStream().flatMap(role -> role.getMenuLists().stream().map(menu->menu.getPermission())).distinct().collect(Collectors.toList())
		);
	}


}
