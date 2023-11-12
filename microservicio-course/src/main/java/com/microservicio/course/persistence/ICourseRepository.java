package com.microservicio.course.persistence;

import com.microservicio.course.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {

}
