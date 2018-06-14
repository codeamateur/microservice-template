package com.zjx.dev.template.auth.repository;

import com.zjx.dev.template.auth.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findUserByUsername(String username);

}
