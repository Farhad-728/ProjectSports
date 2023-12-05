package com.example.springapplication.service.impl;

import com.example.springapplication.entity.User;
import com.example.springapplication.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
//        return (List<User>) new User(1, "test@gmail.com", "1234");
        return Collections.singletonList(User.builder()
                .id(1)
                .username("Fedya")
                .password("123")
                .email("fedya@gmail.com")
                .build()
        );
    }
}
