package com.student.demo.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dto.request.UserRoleRequest;
import com.student.demo.dto.response.UserRoleResponse;
import com.student.demo.mapper.UserRoleMapper;
import com.student.demo.model.Role;
import com.student.demo.model.User;
import com.student.demo.model.UserRole;
import com.student.demo.repository.RoleRepository;
import com.student.demo.repository.UserRepository;
import com.student.demo.repository.UserRoleRepository;
import com.student.demo.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService
{
	@Autowired
    private UserRoleRepository userRoleRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserRoleResponse assignRole(UserRoleRequest request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Role role = roleRepository.findById(request.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found"));

        UserRole userRole = UserRole.builder()
                .user(user)
                .role(role)
                .accessDate(LocalDate.now())
                .build();

        userRoleRepository.save(userRole);

        return UserRoleMapper.toResponse(userRole);
    }

	@Override
	public void removeRole(Integer userRoleId) {
		// TODO Auto-generated method stub
		 userRoleRepository.deleteById(userRoleId);
	}

	

	

		
		
	}

//	@Override
//	public void deleteUserRole(Integer id) 
//	{
//		// TODO Auto-generated method stub
//		UserRole userRole = userRoleRepository.findById(id)
//				.orElseThrow(()->new RuntimeException("UserRole not found with id:"+id));
//		userRoleRepository.delete(userRole);
//	}


