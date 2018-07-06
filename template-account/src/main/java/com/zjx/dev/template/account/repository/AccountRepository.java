package com.zjx.dev.template.account.repository;

import com.zjx.dev.template.account.domain.entity.SysUserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<SysUserEntity, Integer> {

	SysUserEntity findByUsername(String name);

}
