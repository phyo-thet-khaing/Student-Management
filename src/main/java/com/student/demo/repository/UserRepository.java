package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
