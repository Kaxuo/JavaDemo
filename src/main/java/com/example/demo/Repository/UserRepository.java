package com.example.demo.Repository;

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*Long == id*/
public interface UserRepository extends JpaRepository<User, Long> {
}
