package com.student.demo.dto.request;

import java.time.LocalDate;
import java.util.List;

import com.student.demo.dto.response.StudentResponse;

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
public class StudentRequest extends UserRequest
{
	
	
	//User
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
	
	//student
	private String rollNo;
	private Integer semester;
	private LocalDate dob;
	
	
	//assgin role 
	private List<Integer> roleIds;
	
	
}
