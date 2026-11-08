//package com.student.demo.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.student.demo.dto.DepartmentDto;
//import com.student.demo.mapper.DepartmentMapper;
//import com.student.demo.mapper.StudentMapper;
//import com.student.demo.model.Department;
//import com.student.demo.model.Student;
//import com.student.demo.repository.DepartmentRepository;
//import com.student.demo.service.DepartmentService;
//
//@Service
//public class DepartmentServiceImpl implements DepartmentService
//{
//	
//	@Autowired
//    private DepartmentRepository departmentRepo;
//
//   
//
//    // ---------------- Department CRUD ----------------
//    @Override
//    public List<DepartmentDto> getAllDepartments() {
//        return departmentRepo.findAll()
//                             .stream()
//                             .map(DepartmentMapper::mapToDto)
//                             .collect(Collectors.toList());
//    }
//
//    @Override
//    public DepartmentDto getDepartmentById(Integer id) {
//        Department dept = departmentRepo.findById(id)
//                .orElseThrow(() -> new RuntimeException("Department not found"));
//        return DepartmentMapper.mapToDto(dept);
//    }
//
//    @Override
//    public DepartmentDto saveDepartment(DepartmentDto dto) {
//        Department dept = DepartmentMapper.mapToEntity(dto);
//        Department saved = departmentRepo.save(dept);
//        return DepartmentMapper.mapToDto(saved);
//    }
//
//    @Override
//    public DepartmentDto updateDepartment(Integer id, DepartmentDto dto) {
//        Department dept = departmentRepo.findById(id)
//                .orElseThrow(() -> new RuntimeException("Department not found"));
//
//        dept.setName(dto.getName());
//        dept.setDescription(dto.getDescription());
//        Department updated = departmentRepo.save(dept);
//        return DepartmentMapper.mapToDto(updated);
//    }
//
//    @Override
//    public boolean deleteDepartment(Integer id) {
//        if (!departmentRepo.existsById(id)) {
//            return false;
//        }
//        departmentRepo.deleteById(id);
//        return true;
//    }
//	
//	
//	
//}
