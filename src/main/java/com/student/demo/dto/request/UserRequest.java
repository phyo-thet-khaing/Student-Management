package com.student.demo.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserRequest 
{

    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;

    
}