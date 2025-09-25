package com.student_management_system.service;

import com.student_management_system.entity.Course;
import com.student_management_system.exception.ResourceNotFoundException;
import com.student_management_system.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course updateCourse(Course course) {
        String id = course.getId();
        Course existing = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

        existing.setName(course.getName());
        existing.setFee(course.getFee());
        existing.setLecturerId(course.getLecturerId());
        existing.setLecturerName(course.getLecturerName());

        return courseRepository.save(existing);
    }


    public void deleteCourseById(String id) {
        Course existing = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
        courseRepository.delete(existing);
    }

}

