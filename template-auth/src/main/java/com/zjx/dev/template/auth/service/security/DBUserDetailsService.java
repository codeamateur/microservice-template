package com.zjx.dev.template.auth.service.security;

import com.zjx.dev.template.auth.client.AccountServiceClient;
import com.zjx.dev.template.auth.domain.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBUserDetailsService implements UserDetailsService {

	@Autowired
	private AccountServiceClient accountServiceClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDto user = accountServiceClient.getAccountByName(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		for(String permission:user.getPermissions()){
			GrantedAuthority authority = new SimpleGrantedAuthority(permission);
			grantedAuthorities.add(authority);
		}
		return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
	}



}
