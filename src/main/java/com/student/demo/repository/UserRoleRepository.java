package com.student.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Role;
import com.student.demo.model.User;
import com.student.demo.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer>
{

	boolean existsByUserAndRole(User user, Role role);

	List<UserRole> findByUserId(Integer id);

}
