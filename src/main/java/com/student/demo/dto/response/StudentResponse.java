package com.student.demo.dto.response;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class StudentResponse 
{
	
	 private Integer id;
	    private String name;
	    private String email;
	    private String phone;
	    private String address;
	    private Integer roleId; // ✅ Add here
	
	private String rollNo;
	private Integer semester;
	private LocalDate dob;
	
	//course
	private List<StudentCourseResponse> courses;
	
}
