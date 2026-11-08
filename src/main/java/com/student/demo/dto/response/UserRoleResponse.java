package com.student.demo.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRoleResponse
{

    private Integer roleId;
    private String roleName;
    private LocalDate accessDate;
}