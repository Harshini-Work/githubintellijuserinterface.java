package com.practice.crudjpa.Repository;

import com.practice.crudjpa.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface userinterface extends JpaRepository<User,Long> {


   Optional< User >findByName(String name);


}
