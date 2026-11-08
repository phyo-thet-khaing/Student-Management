package com.student.demo.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class AdminResponse 
{


	 private Integer id;
	    private String name;
	    private String email;
	    private String phone;
	    private String address;
	    private Integer roleId; 
	
	
    private String level;
   
}