	package com.student.demo.model;
	
	import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
	
	import jakarta.persistence.*;
	import jakarta.validation.constraints.NotBlank;
	import jakarta.validation.constraints.Size;
	import lombok.*;
import lombok.experimental.SuperBuilder;
	
	
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
	public class Student extends User
	{
			
	 	@Column(name = "roll_no", unique = true, nullable = false)
	    private String rollNo;
	    
		
		
	    private Integer semester;
	    
	    @Column(name = "date_of_birth")
	    private LocalDate dob; 
	    
	    @OneToMany(mappedBy = "student",
	            cascade = CascadeType.ALL,
	            orphanRemoval = true)
	    private List<StudentCourse> studentCourses = new ArrayList<>();
	   
			
	}
