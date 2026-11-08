package com.student.demo.mapper;


import com.student.demo.dto.request.UserRoleRequest;
import com.student.demo.dto.response.UserRoleResponse;
import com.student.demo.model.Role;
import com.student.demo.model.User;
import com.student.demo.model.UserRole;

public class UserRoleMapper
{
	public static UserRoleResponse toResponse(UserRole userRole) 
	{
        return UserRoleResponse.builder()
                .roleId(userRole.getRole().getId())
                .roleName(userRole.getRole().getName())
                .accessDate(userRole.getAccessDate()) // ← include this
                .build();
    }
 
}