package com.student_management_system.service;

import com.student_management_system.entity.Student;
import com.student_management_system.exception.ResourceNotFoundException;
import com.student_management_system.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(String id){
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        String id = student.getId();
        Student existing = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));

        existing.setTitle(student.getTitle());
        existing.setName(student.getName());
        existing.setAddress(student.getAddress());
        existing.setCity(student.getCity());
        existing.setCourse(student.getCourse());

        return studentRepository.save(existing);
    }


    public void deleteStudentById(String id){
        Student existing = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        studentRepository.delete(existing);
    }

    @Override
    public Page<Student> getStudentsPaginated(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }
}

