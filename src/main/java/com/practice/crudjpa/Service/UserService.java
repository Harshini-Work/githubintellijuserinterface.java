package com.practice.crudjpa.Service;

import com.practice.crudjpa.Entity.User;
import com.practice.crudjpa.Exception.ResourceNotFoundException;
import com.practice.crudjpa.Repository.userinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
   @Autowired
    private  userinterface repo;

    public List <User> saveUser(List <User >user){
        return repo.saveAll(user);
    }
    public User getUser(Long id){

        return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("user not fpund withid "+id));
    }
    public User getUserName(String name){
        return repo.findByName(name).orElseThrow(()-> new ResourceNotFoundException("User not found name :"+name));
    }
    public List<User> getUserall() {
        List<User> list = repo.findAll();
        if (list.isEmpty()) throw new ResourceNotFoundException("No users available");

        return list;
    }
    public String delete(Long id){
         User user =repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Cannot delete. User not found with id: "+id));
            repo.delete(user);
         return " Deleted sucessfully";


    }
    public User updatebyid(Long id, User newuser){
        User existing = repo.findById(id).orElse(null);
        if(existing!=null){
            existing.setName(newuser.getName());
             return repo.save(existing);
        }
        return null;
    }

}
