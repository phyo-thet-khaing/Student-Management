package com.student.demo.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;  // ✅ Fix 2: Missing import


import com.student.demo.dto.RoleDto;
import com.student.demo.dto.request.AdminRequest;
import com.student.demo.dto.response.AdminResponse;
import com.student.demo.dto.response.RoleResponse;
import com.student.demo.dto.response.UserRoleResponse;
import com.student.demo.model.Admin;
import com.student.demo.model.Role;
import com.student.demo.model.UserRole;

public class AdminMapper
{
	
	public static AdminResponse toResponse(Admin admin)
	{
	
		
		return AdminResponse.builder()
                .id(admin.getId())
                .name(admin.getName())
                .email(admin.getEmail())
                .phone(admin.getPhone())
                .address(admin.getAddress())
                .level(admin.getLevel())
                .roleId(admin.getRole().getId())
                .build();
				
				
				
				
				
	}
	
	
 
}