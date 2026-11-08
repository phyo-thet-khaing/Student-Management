//package com.student.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.student.demo.dto.StudentDto;
//import com.student.demo.dto.TeacherDto;
//import com.student.demo.model.Role;
//import com.student.demo.service.RoleService;
//import com.student.demo.service.TeacherService;
//
//
//@RestController
//@RequestMapping("/teacher")
//public class TeacherController
//{
//
//    @Autowired
//    private TeacherService teacherService;
//
//    @Autowired
//    private RoleService roleService;
//
//    // Get All Teachers
//    @GetMapping("/")
//    public List<TeacherDto> teacherList()
//    {
//    	List<TeacherDto> teachers = teacherService.getAllTeachers();
//        return teachers;
//    }
//
//  
//}
