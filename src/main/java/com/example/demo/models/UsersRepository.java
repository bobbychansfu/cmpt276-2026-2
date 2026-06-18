package com.example.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findByNameAndPassword(String name, String password);
}
