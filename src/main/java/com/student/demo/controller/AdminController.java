package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.student.demo.dto.StudentDto;
import com.student.demo.dto.request.AdminRequest;
import com.student.demo.dto.response.AdminResponse;
import com.student.demo.model.Role;
import com.student.demo.service.AdminService;
import com.student.demo.service.RoleService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/admin")
public class AdminController
{
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private RoleService roleService;
	


	@GetMapping("/list")
    public ResponseEntity<List<AdminResponse>> getAllAdmins()
	{
        List<AdminResponse> adminList = adminService.getAllAdmins();
        return ResponseEntity.ok(adminList);
    }
	
	
	// ✅ Create
	@PostMapping("/add")
	public ResponseEntity<AdminResponse> createAdmin(@Valid @RequestBody AdminRequest request) 
	{
	    return ResponseEntity.ok(adminService.createAdmin(request));
	}
    
	
	@PutMapping("/{id}")
	public ResponseEntity<AdminResponse> update(@PathVariable Integer id,
	                                            @RequestBody AdminRequest request) {
	    return ResponseEntity.ok(adminService.updateAdmin(id, request));
	}
	
//	@PutMapping("/update/{id}")
//    public ResponseEntity<AdminResponse> updateAdmin(
//            @PathVariable Integer id,
//            @RequestBody AdminRequest request) {
//        AdminResponse response = adminService.updateAdmin(id, request);
//        return ResponseEntity.ok(response);
//    }
  

}
