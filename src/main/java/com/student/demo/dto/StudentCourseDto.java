package com.student.demo.dto;

import java.sql.Date;
import java.time.LocalDate;

import com.student.demo.model.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentCourseDto
{
	 	private Integer id;

	    private Integer studentId;
	    private String  studentName;
	    private Integer courseId;
	    private String courseName;
	    
	    private LocalDate startDate;
	    private LocalDate endDate;
	    
}
