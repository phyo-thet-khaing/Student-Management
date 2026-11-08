package com.student.demo.dto;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDto
{
	
	 	private Integer id;
	    private String code;
	    private String name;
	    private String description;
	    private List<TeacherDto> teachers;
	
	
}
