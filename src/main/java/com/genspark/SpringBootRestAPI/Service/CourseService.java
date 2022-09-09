package com.genspark.SpringBootRestAPI.Service;

import com.genspark.SpringBootRestAPI.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(int courseId);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourseById(int courseId);
}
