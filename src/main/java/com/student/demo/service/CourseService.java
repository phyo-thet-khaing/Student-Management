package com.student.demo.service;

import java.util.List;

import com.student.demo.dto.CourseDto;
import com.student.demo.dto.request.CourseRequest;
import com.student.demo.dto.response.CourseResponse;

public interface CourseService 
{

	CourseResponse createCourse(CourseRequest request);

	List<CourseResponse> getAllCourses();

}
