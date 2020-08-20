package com.dd.repository;

import org.springframework.data.repository.CrudRepository;

import com.dd.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

    User findByEmail(String email);
}