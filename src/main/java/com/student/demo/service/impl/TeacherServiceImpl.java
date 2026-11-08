//package com.student.demo.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.student.demo.dto.TeacherDto;
//import com.student.demo.mapper.RoleMapper;
//import com.student.demo.mapper.StudentMapper;
//import com.student.demo.mapper.TeacherMapper;
//import com.student.demo.model.Department;
//import com.student.demo.model.Teacher;
//
//import com.student.demo.repository.TeacherRepository;
//import com.student.demo.service.TeacherService;
//
//@Service
//public class TeacherServiceImpl implements TeacherService {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//	@Override
//	public List<TeacherDto> getAllTeachers() 
//	{
//		// TODO Auto-generated method stub
//		return teacherRepository.findAll()
//				.stream()
//				.map(teacher->TeacherMapper.mapToDto(teacher))
//				.collect(Collectors.toList());
//	}
//
//	
//
//    
//
//    }
//
