package com.wikode.data.demo.mapper;

import com.wikode.data.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    Boolean existsByAccountAndPassword(String account, String password);                   //登录用，账号密码匹配
    String findUserByAccount(String account);
}
