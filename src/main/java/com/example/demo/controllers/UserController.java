package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/read")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.edit(id, user);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
