package com.student.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dto.CourseDto;
import com.student.demo.dto.request.CourseRequest;
import com.student.demo.dto.response.CourseResponse;
import com.student.demo.mapper.AdminMapper;
import com.student.demo.mapper.CourseMapper;
import com.student.demo.model.Admin;
import com.student.demo.model.Course;
import com.student.demo.repository.CourseRepository;
import com.student.demo.service.CourseService;

import jakarta.transaction.Transactional;

@Service
public class CourseServiceImpl implements CourseService
{
	@Autowired
	private CourseRepository courseRepository;


	@Override
	@Transactional
	public CourseResponse createCourse(CourseRequest request) {
		// TODO Auto-generated method stub
		 Course course = CourseMapper.toEntity(request);
	        return CourseMapper.toResponse(courseRepository.save(course));
	}


	@Override
	public List<CourseResponse> getAllCourses() 
	{
		// TODO Auto-generated method stub
		return courseRepository.findAll()
				.stream()
				.map(CourseMapper::toResponse)
				.collect(Collectors.toList());
	}


}
