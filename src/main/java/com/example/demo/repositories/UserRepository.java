package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/28/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    /*
    @Query(value = "select fname from user where username=?0",nativeQuery = true)
    User findFnameByUsername(String username);
    @Query
    User findLnameByUsername(String username);
    */
    @Query(value= "select username,id from User where username=?0",nativeQuery = true)
    List<User> findAllByUsername(String username);
}
