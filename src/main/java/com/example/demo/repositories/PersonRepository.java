package com.example.demo.repositories;

import com.example.demo.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 6/30/17.
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {
    /*
@Query(value = "select DISTINCT fname from Person where email=?0",nativeQuery = true)
Person findFnameByEmail(String username);
@Query
Person findLnameByEmail(String username);
*/
}
