package com.example.demo;

import com.example.demo.Skills;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/28/17.
 */
public interface SkillRepository extends CrudRepository<Skills, Integer> {
    @Query
    public List<Skills> findAllByEmail(String email);
}
