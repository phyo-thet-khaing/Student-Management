//package com.student.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.student.demo.dto.DepartmentDto;
//import com.student.demo.dto.TeacherDto;
//import com.student.demo.service.DepartmentService;
//
//@RestController
//@RequestMapping("/department")
//public class DepartmentController {
//
//    @Autowired
//    private DepartmentService departmentService;
//
//    // Get All Departments
//    @GetMapping("/")
//    public List<DepartmentDto> getAllDepartments() {
//        return departmentService.getAllDepartments();
//    }
//
//    // Get Department by Id
//    @GetMapping("/{id}")
//    public DepartmentDto getDepartmentById(@PathVariable Integer id) {
//        return departmentService.getDepartmentById(id);
//    }
//
//    // Add Department
//    @PostMapping("/add")
//    public DepartmentDto addDepartment(@RequestBody DepartmentDto dto) {
//        return departmentService.saveDepartment(dto);
//    }
//
//    // Edit Department
//    @PutMapping("/edit/{id}")
//    public DepartmentDto editDepartment(@PathVariable Integer id,
//                                        @RequestBody DepartmentDto dto) {
//        return departmentService.updateDepartment(id, dto);
//    }
//
//    // Delete Department
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteDepartment(@PathVariable Integer id) {
//        return departmentService.deleteDepartment(id);
//    }
//
//    
//}
