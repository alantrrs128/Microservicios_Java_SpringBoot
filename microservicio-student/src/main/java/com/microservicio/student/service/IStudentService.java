package com.microservicio.student.service;

import com.microservicio.student.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByIdCourse(Long idCourse);
}
