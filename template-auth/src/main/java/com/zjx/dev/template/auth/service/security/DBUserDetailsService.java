package com.zjx.dev.template.auth.service.security;

import com.zjx.dev.template.auth.domain.User;
import com.zjx.dev.template.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DBUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		return user;
	}
}
