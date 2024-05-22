package com.example.demo.interfaces;

import com.example.demo.models.User;

import java.util.List;

public interface UserInterface {
    User create(User user);
    List<User> getAll();
    User edit(Long id,User user);
    String delete(Long id);
}
