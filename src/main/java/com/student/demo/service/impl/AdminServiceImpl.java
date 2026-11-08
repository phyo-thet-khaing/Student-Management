package com.student.demo.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dto.request.AdminRequest;
import com.student.demo.dto.response.AdminResponse;
import com.student.demo.mapper.AdminMapper;
import com.student.demo.model.Admin;
import com.student.demo.model.Role;
import com.student.demo.model.UserRole;
import com.student.demo.repository.AdminRepository;
import com.student.demo.repository.RoleRepository;
import com.student.demo.repository.UserRoleRepository;
import com.student.demo.service.AdminService;
import com.student.demo.service.UserRoleService;

import jakarta.transaction.Transactional;

@Service
public class AdminServiceImpl implements AdminService 
{

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    @Transactional
    public AdminResponse createAdmin(AdminRequest request) {

        // 1️⃣ Map roleIds to UserRole entities
//        List<UserRole> userRoles = Optional.ofNullable(request.getRoleIds())
//                .orElse(List.of())
//                .stream()
//                .map(roleId -> {
//                    Role role = roleRepository.findById(roleId)
//                            .orElseThrow(() -> new RuntimeException("Role not found"));
//                    return UserRole.builder()
//                                   .role(role)
//                                   .accessDate(LocalDate.now())
//                                   .build();
//                })
//                .toList();
    	
    	Role role = new Role();
    	
    	role.setId(request.getRoleId());

        // 2️⃣ Build Admin entity
        Admin admin = Admin.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .password(request.getPassword())
                .level(request.getLevel())
                .role(role)
                .build();

        
        // 4️⃣ Save to database
        adminRepository.save(admin);

        // 5️⃣ Map entity to DTO
        return AdminMapper.toResponse(admin);
    }

    // ✅ Get All Admins
    @Override
    public List<AdminResponse> getAllAdmins() {
        return adminRepository.findAll()
                .stream()
                .map(AdminMapper::toResponse)
                .collect(Collectors.toList());
    }

	

    // ✅ Update Admin
    @Override
    @Transactional
    public AdminResponse updateAdmin(Integer id, AdminRequest request) {
        Admin admin = adminRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Admin not found"));

        Role role = new Role();
        role.setId(request.getRoleId());
        
        admin.setName(request.getName());
        admin.setEmail(request.getEmail());
        admin.setPhone(request.getPhone());
        admin.setAddress(request.getAddress());
        admin.setLevel(request.getLevel());
        admin.setRole(role);//Role
        

        adminRepository.save(admin);

        return AdminMapper.toResponse(admin);
    }
}