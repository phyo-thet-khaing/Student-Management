package com.student.demo.mapper;


import com.student.demo.dto.request.StudentRequest;
import com.student.demo.dto.response.StudentCourseResponse;
import com.student.demo.dto.response.StudentResponse;
import com.student.demo.dto.response.UserRoleResponse;
import com.student.demo.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper
{
	public static StudentResponse toResponse(Student student)
	{
//		List<UserRoleResponse> roles = student.getRoles() == null ?
//				List.of(): student.getRoles()
//									.stream()
//									.map(UserRoleMapper::toResponse)
//									.toList();
		
		 // 🔹 Courses Mapping
        List<StudentCourseResponse> courses =
                student.getStudentCourses() == null
                        ? List.of()
                        : student.getStudentCourses()
                                .stream()
                                .map(StudentCourseMapper::toResponse)
                                .toList();
        
		return StudentResponse.builder()
				.id(student.getId())
				.name(student.getName())
				.email(student.getEmail())
				.phone(student.getPhone())
				.rollNo(student.getRollNo())
				.address(student.getAddress())
				.semester(student.getSemester())
				.dob(student.getDob())
				.roleId(student.getRole().getId())
				.courses(courses)
				.build();
		
	}
	
	public static Student toEntity(StudentRequest request)
	{

        return Student.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .password(request.getPassword())

                // student fields
                .rollNo(request.getRollNo())
                .semester(request.getSemester())
                .dob(request.getDob())

                .build();
    }

}