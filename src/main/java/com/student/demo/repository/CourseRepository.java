package com.student.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Course;
import com.student.demo.model.Student;

public interface CourseRepository extends JpaRepository<Course, Integer>
{

	Optional<Student> findByName(String courseName);

}
