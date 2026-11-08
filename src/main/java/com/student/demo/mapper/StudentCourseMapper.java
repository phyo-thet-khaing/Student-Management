package com.student.demo.mapper;

import com.student.demo.dto.StudentCourseDto;
import com.student.demo.dto.request.StudentCourseRequest;
import com.student.demo.dto.response.StudentCourseResponse;
import com.student.demo.model.Student;
import com.student.demo.model.Course;
import com.student.demo.model.StudentCourse;

import java.time.LocalDate;

public class StudentCourseMapper
{
	
	//Entity -> response
	public static StudentCourseResponse toResponse(StudentCourse sc)
	{
		return StudentCourseResponse.builder()
				.id(sc.getId())
				.studentId(sc.getStudent().getId())
				.courseId(sc.getCourse().getId())
				.enrollmentDate(sc.getEnrollmentDate())
				.build();
	
	}
	
	//Request -> Entity
	 public static StudentCourse toEntity(StudentCourseRequest request)
	 {
	        StudentCourse sc = new StudentCourse();
	        sc.setEnrollmentDate(request.getEnrollmentDate());
	        return sc;
	    }
	

    
}