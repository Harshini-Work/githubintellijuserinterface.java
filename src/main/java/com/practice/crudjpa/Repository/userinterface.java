package com.practice.crudjpa.Repository;

import com.practice.crudjpa.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userinterface extends JpaRepository<User,Integer>{


    User findByName(String name);


}
