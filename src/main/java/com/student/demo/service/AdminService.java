package com.student.demo.service;

import java.util.List;

import org.jspecify.annotations.Nullable;


import com.student.demo.dto.request.AdminRequest;
import com.student.demo.dto.response.AdminResponse;

public interface AdminService
{

	AdminResponse createAdmin(AdminRequest adminRequest);

	List<AdminResponse> getAllAdmins();

	 AdminResponse updateAdmin(Integer id, AdminRequest request);



	
	


	

	

}
