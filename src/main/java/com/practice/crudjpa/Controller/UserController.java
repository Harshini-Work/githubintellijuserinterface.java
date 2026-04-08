package com.practice.crudjpa.Controller;
import com.practice.crudjpa.Entity.User;
import com.practice.crudjpa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/add")
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        return service.getUser(id);
    }
    @GetMapping("/name/{name}")
    public User getUserName(@PathVariable String name){
         return service.getUserName(name);
    }
    @GetMapping("/all")
    public List<User> getUserall(){
        return service.getUserall();
    }
}
