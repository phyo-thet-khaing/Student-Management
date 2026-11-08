package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.dto.request.UserRoleRequest;
import com.student.demo.dto.response.UserRoleResponse;
import com.student.demo.model.User;
import com.student.demo.repository.UserRepository;
import com.student.demo.service.UserRoleService;

@RestController
@RequestMapping("/api/userrole")
public class UserRoleController
{
	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired
	private UserRepository userRepository;
	
	 	@PostMapping("/")
	    public ResponseEntity<UserRoleResponse> assignRole(@RequestBody UserRoleRequest request)
	 	{
	        return ResponseEntity.ok(userRoleService.assignRole(request));
	    }
	
	 	
	 	 // Delete role
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> removeRole(@PathVariable Integer id) {
	        userRoleService.removeRole(id);
	        return ResponseEntity.noContent().build();
	    }
	
	 
	
}
