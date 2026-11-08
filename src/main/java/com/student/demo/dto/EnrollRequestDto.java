package com.student.demo.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollRequestDto
{

    
    private Integer studentId;

    private Integer courseId;
   

     //Optional: later you can add startDate if you want
     private Date startDate;
     private Date endDate;
}