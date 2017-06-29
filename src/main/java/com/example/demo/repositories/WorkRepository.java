package com.example.demo;

import com.example.demo.Work;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/28/17.
 */
public interface WorkRepository extends CrudRepository<Work, Integer>{
    @Query
    public List<Work> findAllByEmail(String email);
}
