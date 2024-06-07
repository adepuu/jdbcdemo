package com.adepuu.demojdbc.auth.repository;

import com.adepuu.demojdbc.auth.entity.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    @Query("SELECT * FROM users WHERE username = :username")
    User findByUsername(String username);
}
