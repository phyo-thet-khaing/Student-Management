package com.student.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.StudentCourse;

public interface StudentCourseRepository  extends JpaRepository<StudentCourse, Integer>
{

	Optional<StudentCourse> findByStudentIdAndCourseId(Integer studentId, Integer courseId);

}
