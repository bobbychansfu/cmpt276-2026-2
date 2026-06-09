package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriBuilder;

import com.example.demo.models.User;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.UsersRepository;

@Controller
public class UsersController {
    private List<User> users = new ArrayList<>();

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users/show")
    public String showUsers(Model model) {
        users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/showall";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setEmail(email);
        newUser.setPassword(password);
        usersRepository.save(newUser);
        return "redirect:/users/show";
    }
}