package com.zjx.dev.template.auth.service.security;

import com.zjx.dev.template.auth.domain.SysMenuEntity;
import com.zjx.dev.template.auth.domain.SysRoleEntity;
import com.zjx.dev.template.auth.domain.SysUserEntity;
import com.zjx.dev.template.auth.repository.UserRepository;
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
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUserEntity user = repository.findUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		List<SysRoleEntity> roleLists = user.getRoleLists();
		for (SysRoleEntity role:roleLists) {
			List<SysMenuEntity> menuLists = role.getMenuLists();
			for(SysMenuEntity menu:menuLists){
				GrantedAuthority authority = new SimpleGrantedAuthority(menu.getPermission());
				grantedAuthorities.add(authority);
			}
		}
		return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
	}

//	@Autowired
//	private AccountServiceClient accountServiceClient;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		UserDto user = accountServiceClient.getAccountByName(username);
//		if (user == null) {
//			throw new UsernameNotFoundException(username);
//		}
//		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//		for(String permission:user.getPermissions()){
//			GrantedAuthority authority = new SimpleGrantedAuthority(permission);
//			grantedAuthorities.add(authority);
//		}
//		return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
//	}



}
