package com.microservicio.course.service;

import com.microservicio.course.client.StudentClient;
import com.microservicio.course.controller.dto.StudentDTO;
import com.microservicio.course.entities.Course;
import com.microservicio.course.http.response.StudentByCourseResponse;
import com.microservicio.course.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {
    @Autowired
    private ICourseRepository courseRepository;
    @Autowired
    private StudentClient studentClient;
    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourde(Long idCourde) {
        //Consultar el curso
        Course course = courseRepository.findById(idCourde).orElse(new Course());
        //Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudenByCourse(idCourde);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
