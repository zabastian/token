package com.jpa.baisc.controller;

import com.jpa.baisc.dto.student.StudentCreateRequestDto;
import com.jpa.baisc.dto.student.StudentCreateResponseDto;
import com.jpa.baisc.dto.student.StudentListResponseDto;
import com.jpa.baisc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * Student 생성 API
     */
    @PostMapping
    public ResponseEntity<StudentCreateResponseDto> createCourseAPI(@RequestBody StudentCreateRequestDto studentCreateRequestDto) {
        StudentCreateResponseDto response = studentService.createStudent(studentCreateRequestDto);
        return new ResponseEntity<StudentCreateResponseDto>(response, HttpStatus.CREATED);
    }

    /**
     * Student 조회 API
     */
    @GetMapping
    public ResponseEntity<StudentListResponseDto> getCourseListAPI() {
        StudentListResponseDto response = studentService.getStudentList();
        return new ResponseEntity<StudentListResponseDto>(response, HttpStatus.OK);
    }
}
