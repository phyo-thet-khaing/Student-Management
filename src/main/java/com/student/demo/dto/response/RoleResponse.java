package com.student.demo.dto.response;

import java.time.LocalDate;

import com.student.demo.model.Role.RoleBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleResponse
{

    private Integer id;
    private String name;


}