package com.student.demo.dto.request;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserRoleRequest
{

    private Integer userId;          // ID of the user
    private Integer roleId;   // IDs of roles to assign
   
}