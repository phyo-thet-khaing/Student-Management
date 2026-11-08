package com.student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.dto.EnrollRequestDto;
import com.student.demo.dto.StudentCourseDto;
import com.student.demo.dto.request.StudentCourseRequest;
import com.student.demo.dto.response.StudentCourseResponse;
import com.student.demo.repository.CourseRepository;
import com.student.demo.repository.StudentRepository;
import com.student.demo.repository.UserRepository;
import com.student.demo.service.StudentCourseService;
import com.student.demo.service.UserRoleService;

@RestController
@RequestMapping("/api/studentcourse")
public class StudentCourseController{

		@Autowired
		private StudentCourseService studentCourseService;


	@PostMapping
	public ResponseEntity<StudentCourseResponse> enrollStudent(@RequestBody StudentCourseRequest request)
	{
	    return ResponseEntity.status(HttpStatus.CREATED)
	            .body(studentCourseService.enrollStudent(request));
	}

	 // 🔹 PUT → update enrollment (e.g., change course or enrollmentDate)
    @PutMapping("/{id}")
    public ResponseEntity<StudentCourseResponse> updateEnrollment(
            @PathVariable Integer id,
            @RequestBody StudentCourseRequest request) {
        StudentCourseResponse updated = studentCourseService.updateEnrollment(id, request);
        return ResponseEntity.ok(updated);
    }
	
}
