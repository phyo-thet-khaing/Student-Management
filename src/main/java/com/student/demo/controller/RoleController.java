package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.student.demo.dto.RoleDto;
import com.student.demo.dto.request.RoleRequest;
import com.student.demo.dto.response.RoleResponse;
import com.student.demo.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    

    // Create new role
    @PostMapping("/add")
    public ResponseEntity<RoleResponse> createRole(@RequestBody RoleRequest request) {

        RoleResponse createdRole = roleService.createRole(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdRole);
    }
    
    //delete 
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRole(@PathVariable Integer id)
    {
    	roleService.deleteRole(id);
    	return ResponseEntity.status(HttpStatus.OK)
    			.body("Role deleted Successfully");
    }
    
    @GetMapping("/list")
    public ResponseEntity<List<RoleResponse>> getAllRoles() {
        List<RoleResponse> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }
}