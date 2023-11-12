package com.microservicio.course.http.response;

import com.microservicio.course.controller.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentByCourseResponse {
    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}
