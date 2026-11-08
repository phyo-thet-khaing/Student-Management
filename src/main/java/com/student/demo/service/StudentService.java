package com.student.demo.service;

import java.util.List;

import com.student.demo.dto.StudentDto;
import com.student.demo.dto.request.StudentRequest;
import com.student.demo.dto.response.StudentResponse;
import com.student.demo.model.Student;

public interface StudentService 
{
	
	StudentResponse create(StudentRequest request);
	
//	public List<StudentDto> getAllStudents();
//
//	public StudentDto createStudent(StudentDto studentDto);

	

//	public StudentDto updateStudent(Integer id, StudentDto studentDto);
	
	
}
