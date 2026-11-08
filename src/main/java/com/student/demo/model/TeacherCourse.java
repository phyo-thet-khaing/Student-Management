package com.student.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
	public class TeacherCourse 
	{
			
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private Date startDate;
		private Date endDate;
		
		@ManyToOne
		@JoinColumn(name="teacher_id")
		private Teacher teacher;
		
		@ManyToOne
		@JoinColumn(name="course_id")
		private Course course;    
	}
