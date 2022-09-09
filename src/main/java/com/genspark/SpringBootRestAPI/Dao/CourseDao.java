package com.genspark.SpringBootRestAPI.Dao;

import com.genspark.SpringBootRestAPI.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {
}
