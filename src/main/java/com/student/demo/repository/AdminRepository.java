package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{

}
