package com.student.demo.service;

import java.util.List;

import com.student.demo.dto.request.UserRoleRequest;
import com.student.demo.dto.response.UserRoleResponse;
import com.student.demo.model.User;

public interface UserRoleService
{

    UserRoleResponse assignRole(UserRoleRequest request);

//    UserRoleResponse updateRole(Integer userRoleId, UserRoleRequest request);
//
    void removeRole(Integer userRoleId);
//


	
	
}
