package com.student.demo.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentCourseResponse 
{
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private LocalDate enrollmentDate;
}