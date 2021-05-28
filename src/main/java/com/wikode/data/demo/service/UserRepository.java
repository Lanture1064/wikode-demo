package com.wikode.data.demo.service;

import com.wikode.data.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
