package com.student.demo.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.student.demo.dto.request.StudentRequest;
import com.student.demo.dto.response.RoleResponse;
import com.student.demo.dto.response.StudentResponse;
import com.student.demo.mapper.AdminMapper;
import com.student.demo.mapper.StudentMapper;
import com.student.demo.model.Admin;
import com.student.demo.model.Course;
import com.student.demo.model.Role;
import com.student.demo.model.Student;
import com.student.demo.model.StudentCourse;
import com.student.demo.model.UserRole;
import com.student.demo.repository.CourseRepository;
import com.student.demo.repository.RoleRepository;
import com.student.demo.repository.StudentCourseRepository;
import com.student.demo.repository.StudentRepository;
import com.student.demo.repository.UserRoleRepository;
import com.student.demo.service.StudentService;
import com.student.demo.service.UserRoleService;




@Service
public class StudentServiceImpl implements StudentService
{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
    private UserRoleService userRoleService;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentCourseRepository studentCourseRepository;



	 // ✅ CREATE
    @Override
    public StudentResponse create(StudentRequest request) {

        // 🔹 Convert request → entity
        Student student = StudentMapper.toEntity(request);



        // 🔹 Save
        Student savedStudent = studentRepository.save(student);

        return StudentMapper.toResponse(savedStudent);
    }


   



 
    
}
