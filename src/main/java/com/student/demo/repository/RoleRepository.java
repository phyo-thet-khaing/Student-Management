package com.student.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.dto.RoleDto;
import com.student.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
	Optional<Role>findByName(String roleName);
}
