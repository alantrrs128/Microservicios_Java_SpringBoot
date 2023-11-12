package com.microservicio.course.service;

import com.microservicio.course.entities.Course;
import com.microservicio.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    StudentByCourseResponse findStudentByIdCourde(Long idCourde);
}
