package com.student.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Date;
import java.util.List;

import com.student.demo.model.Course;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class StudentDto extends UserDto 
{
    private String rollNo;
    private Integer semester;
    private Date dob;
    private List<StudentCourseDto> studentCourses;
  
}