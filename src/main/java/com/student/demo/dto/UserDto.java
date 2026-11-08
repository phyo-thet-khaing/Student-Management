package com.student.demo.dto;




import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public  class UserDto 
{
	private Integer id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    
    
    private List<RoleDto> roleDtos;
    
}
