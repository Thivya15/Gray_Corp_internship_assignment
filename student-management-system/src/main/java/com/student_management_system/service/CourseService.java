package com.student_management_system.service;

import com.student_management_system.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    Course createCourse(Course course);
    Course getCourseById(String id);
    List<Course> getAllCourses();
    Course updateCourse(Course course);
    void deleteCourseById(String id);
    Page<Course> getCoursesPaginated(Pageable pageable);
}
