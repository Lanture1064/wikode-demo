package com.wikode.data.demo.control;

import com.wikode.data.demo.mapper.UserRepository;
import com.wikode.data.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addUser (@RequestParam String account,@RequestParam String password){
        User n = new User();
        n.setAccount(account);
        n.setAuthStatus(false);
        n.setName("ini");
        n.setPassword(password);
        userRepository.save(n);
        return "Saved.";
    }

    @GetMapping(path = "/get")
    public @ResponseBody
    Optional<User> getUser (@RequestParam Integer ID){
        return userRepository.findById(ID);
    }

    @GetMapping(path = "/all")
    public  @ResponseBody
    Iterable<User> getAllUser(){
        return userRepository.findAll();
    }

}
