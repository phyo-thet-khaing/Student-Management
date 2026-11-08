package com.student.demo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRoleDto
{
	private Integer id;
    private Integer userId;
    private Integer roleId;
    private LocalDate accessDate;
}
