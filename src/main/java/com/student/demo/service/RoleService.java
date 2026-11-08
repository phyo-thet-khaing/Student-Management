package com.student.demo.service;

import java.util.List;

import com.student.demo.dto.RoleDto;
import com.student.demo.dto.request.RoleRequest;
import com.student.demo.dto.response.RoleResponse;
import com.student.demo.model.Role;

public interface RoleService
{

	RoleResponse createRole(RoleRequest request);

	public void deleteRole(Integer id);

	List<RoleResponse> getAllRoles();

	

	

	

	

}
