package com.student.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dto.RoleDto;
import com.student.demo.dto.request.RoleRequest;
import com.student.demo.dto.response.RoleResponse;
import com.student.demo.mapper.AdminMapper;
import com.student.demo.mapper.RoleMapper;
import com.student.demo.model.Admin;
import com.student.demo.model.Role;
import com.student.demo.repository.RoleRepository;
import com.student.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService
{
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public RoleResponse createRole(RoleRequest request)
	{
		// TODO Auto-generated method stub
		roleRepository.findByName(request.getName())
        .ifPresent(r -> {
            throw new RuntimeException("Role already exists");
        });
		Role savedRole = roleRepository.save(RoleMapper.toEntity(request));

	    return RoleMapper.toResponse(savedRole);
	}

	@Override
	public void deleteRole(Integer id) 
	{
		// TODO Auto-generated method stub
		if(!roleRepository.existsById(id))
		{
			throw new  RuntimeException("Role are not found by id"+id);
		}
		 roleRepository.deleteById(id);
	}

	@Override
	public List<RoleResponse> getAllRoles() 
	{
		// TODO Auto-generated method stub
		return roleRepository.findAll()
                .stream()
                .map(RoleMapper::toResponse)
                .collect(Collectors.toList());
	}
	
	


}
