package com.student.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.dto.StudentDto;
import com.student.demo.dto.request.StudentRequest;
import com.student.demo.dto.response.StudentResponse;
import com.student.demo.model.Role;
import com.student.demo.model.Student;
import com.student.demo.repository.StudentRepository;
import com.student.demo.service.RoleService;
import com.student.demo.service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/student")
public class StudentController 
{

    @Autowired
    private StudentService studentService;
    
    @Autowired
	private RoleService roleService;
    
    

    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest request)
    {

        StudentResponse response = studentService.create(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)   // 201
                .body(response);
    }


    

}

