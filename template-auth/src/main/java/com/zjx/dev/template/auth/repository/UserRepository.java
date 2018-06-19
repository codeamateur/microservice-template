package com.zjx.dev.template.auth.repository;

import com.zjx.dev.template.auth.domain.SysUserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<SysUserEntity, Integer> {

    SysUserEntity findUserByUsername(String username);

}
