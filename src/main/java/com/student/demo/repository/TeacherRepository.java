package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{

}
