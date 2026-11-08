package com.student.demo.mapper;

import java.util.List;

import com.student.demo.dto.RoleDto;
import com.student.demo.dto.request.RoleRequest;
import com.student.demo.dto.response.RoleResponse;
import com.student.demo.model.Role;
import com.student.demo.model.UserRole;

public class RoleMapper
{
	
	 public static Role toEntity(RoleRequest request)
	 {
		 return Role.builder()
		 		.name(request.getName())
		 		.build();
	 }
	 
	 public static RoleResponse toResponse(Role role) {
		    // ✅ Add null check before accessing role properties
		    if (role == null) {
		        return null;
		    }
		    
		    return RoleResponse.builder()
		            .id(role.getId())
		            .name(role.getName())
		            
		            .build();
		}

}
