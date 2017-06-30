package com.example.demo;

import com.example.demo.Education;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/28/17.
 */
public interface EduRepository extends CrudRepository<Education, Integer> {
    @Query
    public List<Education> findTop10ByEmail(String email);

}
