package com.practice.crudjpa.Service;

import com.practice.crudjpa.Entity.User;
import com.practice.crudjpa.Repository.userinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   @Autowired
    private  userinterface repo;

    public User saveUser(User user){
        return repo.save(user);
    }
    public User getUser(int id){
         return repo.findById(id).orElse(null);
    }
    public User getUserName(String name){
        return repo.findByName(name);
    }
    public List<User> getUserall(){
         return repo.findAll();
    }

}
