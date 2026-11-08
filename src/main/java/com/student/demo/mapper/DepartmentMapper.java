package com.student.demo.mapper;

import com.student.demo.dto.DepartmentDto;
import com.student.demo.model.Department;

public class DepartmentMapper 
{
	 public static DepartmentDto mapToDto(Department department) {

	        return DepartmentDto.builder()
	                .id(department.getId())
	                .code(department.getCode())
	                .name(department.getName())
	                .description(department.getDescription())
	                .build();
	    }

	    public static Department mapToEntity(DepartmentDto dto) {

	        return Department.builder()
	                .id(dto.getId())
	                .code(dto.getCode())
	                .name(dto.getName())
	                .description(dto.getDescription())
	                .build();
	    }
}
