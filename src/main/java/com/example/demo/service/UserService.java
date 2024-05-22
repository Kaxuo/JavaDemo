package com.example.demo.service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.interfaces.UserInterface;
import com.example.demo.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements UserInterface {

    private final UserRepository userRepository;

/*    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }*/

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User edit(Long id, User user) {
        return userRepository.findById(id).map(u -> {
            u.setName(user.getName());
            u.setEmail(user.getEmail());
            return userRepository.save(u);
        }).orElseThrow(() -> new RuntimeException(("User Not found")));
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "User deleted";
    }
}
