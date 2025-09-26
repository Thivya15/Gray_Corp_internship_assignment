package com.student_management_system.service;

import com.student_management_system.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(String id);
    List<Student> getAllStudents();
    Student updateStudent(Student student);
    void deleteStudentById(String id);
    Page<Student> getStudentsPaginated(Pageable pageable);
}