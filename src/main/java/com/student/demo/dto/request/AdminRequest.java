package com.student.demo.dto.request;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AdminRequest 
{
	//User
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
	
    private String level;
    @NotNull(message = "Role IDs cannot be null")
    private Integer roleId;
}