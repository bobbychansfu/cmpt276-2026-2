package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.User;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {
    private List<User> users = new ArrayList<>();

    UsersController() {
        users.add(new User(1, "John Doe", "john.doe@example.com", "password123"));
        users.add(new User(2, "Jane Smith", "jane.smith@example.com", "password456"));
        users.add(new User(3, "Alice Johnson", "alice.johnson@example.com", "password789"));
    }

    @GetMapping("/users/show")
    public String showUsers(Model model) {
        model.addAttribute("users", users);
        return "users/showall";
    }
}
