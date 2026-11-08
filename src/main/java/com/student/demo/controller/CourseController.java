package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.dto.request.CourseRequest;
import com.student.demo.dto.response.AdminResponse;
import com.student.demo.dto.response.CourseResponse;
import com.student.demo.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController 
{
	
	@Autowired
    private CourseService courseService;

	@PostMapping
    public ResponseEntity<CourseResponse> createCourse(@RequestBody CourseRequest request) 
	{
        CourseResponse response = courseService.createCourse(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
	
	@GetMapping("/list")
	public  ResponseEntity<List<CourseResponse>>  getAllCourses()
	{
		List<CourseResponse> courseList = courseService.getAllCourses();
        return ResponseEntity.ok(courseList); 
	}
	
    
}
