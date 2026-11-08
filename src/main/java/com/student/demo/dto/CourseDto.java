package com.student.demo.dto;

import java.util.List;
import java.util.Set;

import com.student.demo.model.StudentCourse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto
{

    private Integer id;
    private String name;
    private String description;

    private Integer credit;
    private String code;
   
}