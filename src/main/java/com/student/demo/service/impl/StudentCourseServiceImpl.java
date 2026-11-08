package com.student.demo.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dto.EnrollRequestDto;
import com.student.demo.dto.StudentCourseDto;
import com.student.demo.dto.request.StudentCourseRequest;
import com.student.demo.dto.response.StudentCourseResponse;
import com.student.demo.mapper.StudentCourseMapper;
import com.student.demo.model.Course;
import com.student.demo.model.Student;
import com.student.demo.model.StudentCourse;
import com.student.demo.repository.CourseRepository;
import com.student.demo.repository.StudentCourseRepository;
import com.student.demo.repository.StudentRepository;
import com.student.demo.service.StudentCourseService;

@Service
public class StudentCourseServiceImpl implements StudentCourseService
{
	@Autowired
	private StudentCourseRepository studentCourseRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentCourseResponse enrollStudent(StudentCourseRequest request) {

	    Student student = studentRepository.findById(request.getStudentId())
	            .orElseThrow(() -> new RuntimeException("Student not found"));

	    Course course = courseRepository.findById(request.getCourseId())
	            .orElseThrow(() -> new RuntimeException("Course not found"));

	    // Build entity
	    StudentCourse sc = StudentCourse.builder()
	            .student(student)
	            .course(course)
	            .enrollmentDate(request.getEnrollmentDate() != null 
	                            ? request.getEnrollmentDate() 
	                            : LocalDate.now()) // set today if null
	            .build();

	    StudentCourse saved = studentCourseRepository.save(sc);

	    return StudentCourseMapper.toResponse(saved);
	}
	
	//Update
	@Override
	public StudentCourseResponse updateEnrollment(Integer id, StudentCourseRequest request)
	{
		// TODO Auto-generated method stub
		StudentCourse sc = studentCourseRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Enrollment not found"));
		
		//Update course if courseId provided
		if(request.getCourseId()!=null)
		{
			Course course = courseRepository.findById(request.getCourseId())
					.orElseThrow(()->new RuntimeException("Course not found"));
		}
		
		//Update EnrollmentDate if provided
		if(request.getEnrollmentDate()!=null)
		{
			sc.setEnrollmentDate(request.getEnrollmentDate());
		}
		
		StudentCourse updated = studentCourseRepository.save(sc);
		
		return StudentCourseMapper.toResponse(updated);
	}


}
