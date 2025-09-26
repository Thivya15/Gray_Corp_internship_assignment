package com.student_management_system.repository;

import com.student_management_system.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
    Page<Course> findAll(Pageable pageable);
}
