package com.student.demo.mapper;

import java.util.List;

import com.student.demo.dto.request.CourseRequest;
import com.student.demo.dto.response.CourseDetailResponse;
import com.student.demo.dto.response.CourseResponse;
import com.student.demo.dto.response.StudentCourseResponse;
import com.student.demo.model.Course;

public class CourseMapper {

    // Basic CRUD mapping (Entity -> Response)
    public static CourseResponse toResponse(Course course) {
        return CourseResponse.builder()
                .id(course.getId())
                .name(course.getName())
                .description(course.getDescription())
                .credit(course.getCredit())
                .code(course.getCode())
                .build();
    }

    // Detail mapping including enrolled students (Entity -> DetailResponse)
    public static CourseDetailResponse toDetailResponse(Course course) {

        List<StudentCourseResponse> students = course.getStudentCourses() == null ? List.of() :
                course.getStudentCourses().stream()
                        .map(sc -> StudentCourseResponse.builder()
                                .id(sc.getId())
                                .studentId(sc.getStudent().getId())
                                .courseId(sc.getCourse().getId())
                                .enrollmentDate(sc.getEnrollmentDate())
                                .build())
                        .toList();

        return CourseDetailResponse.builder()
                .id(course.getId())
                .name(course.getName())
                .description(course.getDescription())
                .credit(course.getCredit())
                .code(course.getCode())
                .students(students)
                .build();
    }

    // Request -> Entity mapping (CourseRequest -> Course)
    public static Course toEntity(CourseRequest request) {
        return Course.builder()
                .name(request.getName())
                .description(request.getDescription())
                .credit(request.getCredit())
                .code(request.getCode())
                .build();
    }
}