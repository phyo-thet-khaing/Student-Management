package com.student.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User
{

	@Column(name = "teacher_id", unique = true)
    private String teacherId;
	
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "department_id")  // foreign key column
	private Department department;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="course_id")
	private Course course;
	
	
}
