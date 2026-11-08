package com.student.demo.dto;

import com.student.demo.model.Course;
import com.student.demo.model.Department;
import com.student.demo.model.User;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class TeacherDto extends User
{
	
	
    private String teacherId;
	private Department department;
	private Course course;
}
