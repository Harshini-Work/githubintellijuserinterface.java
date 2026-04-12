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
    public List <User> saveUser(@RequestBody List <User> user){
        return service.saveUser(user);
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
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
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }
    @PutMapping("/{id}")
    public String updatebtid(@PathVariable Long id ,@RequestBody User newuser){
       User update=    service.updatebyid(id,newuser);
           return (update!=null)?"Updated Sucessfully ":"usernot found";
    }


}
