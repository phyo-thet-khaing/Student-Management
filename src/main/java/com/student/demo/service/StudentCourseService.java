package com.student.demo.service;

import com.student.demo.dto.EnrollRequestDto;
import com.student.demo.dto.StudentCourseDto;
import com.student.demo.dto.request.StudentCourseRequest;
import com.student.demo.dto.response.StudentCourseResponse;

public interface StudentCourseService
{

	 StudentCourseResponse enrollStudent(StudentCourseRequest request);
	 
	// Update enrollment (e.g., enrollmentDate or change course)
	StudentCourseResponse updateEnrollment(Integer id, StudentCourseRequest request);

}
