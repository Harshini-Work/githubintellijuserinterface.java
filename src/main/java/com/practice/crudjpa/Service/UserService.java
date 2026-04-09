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

    public List <User> saveUser(List <User >user){
        return repo.saveAll(user);
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
    public String delete(int id){
        repo.deleteById(id);
        return "Deleted Sucessfully ";

    }
    public User updatebyid(int id, User newuser){
        User existing = repo.findById(id).orElse(null);
        if(existing!=null){
            existing.setName(newuser.getName());
             return repo.save(existing);
        }
        return null;
    }

}
