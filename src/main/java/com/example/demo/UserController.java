package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public User user(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age, @RequestParam(value = "score") int score){
        return new User(name, age, score);
    }
}
