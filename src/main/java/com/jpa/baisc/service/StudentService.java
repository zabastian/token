package com.jpa.baisc.service;

import com.jpa.baisc.domain.Course;
import com.jpa.baisc.domain.Student;
import com.jpa.baisc.dto.student.StudentCreateRequestDto;
import com.jpa.baisc.dto.student.StudentCreateResponseDto;
import com.jpa.baisc.dto.student.StudentListResponseDto;
import com.jpa.baisc.repository.CourseRepository;
import com.jpa.baisc.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class StudentService {

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    /**
     * Student 생성 서비스
     * @param studentCreateRequestDto
     */
    @Transactional
    public StudentCreateResponseDto createStudent(StudentCreateRequestDto studentCreateRequestDto) {
        Long foundCourseId = studentCreateRequestDto.getCourseId();
        Course foundCourse = courseRepository.findById(foundCourseId)
                .orElseThrow(() -> new NoSuchElementException("course not found"));
        Student newStudent = Student.createFrom(studentCreateRequestDto.getStudentName(), foundCourse);
        Student savedStudent = studentRepository.save(newStudent);
        return StudentCreateResponseDto.createFrom(savedStudent);
    }

    /**
     * Student 목록 조회 서비스
     */
    public StudentListResponseDto getStudentList() {
        List<Student> foundStudentList = studentRepository.findAll();
        List<StudentListResponseDto.StudentDto> studentDtoList = foundStudentList.stream()
                .map(student -> StudentListResponseDto.StudentDto.createFrom(student, student.getCourse()))
                .toList();
        return StudentListResponseDto.createFrom(studentDtoList);
    }

    public void test() {
        //첫번째( studentList에서 jun이라는 name을 찾아오고 로그를 찍는다
//        List<Student> studentList = studentRepository.findByName("jun");
//         for ( Student student : studentList){
//             log.info("학생이름: {}" , student.getName());
//         }

        //두번째( studentList에서 1,2 아이디에 따른 name을 가지고와 출력해준다.
//        List<Long> studentWhiteList =new ArrayList<>();
//         studentWhiteList.add(1L);
//         studentWhiteList.add(2L);
//         List<Student> studentList = studentRepository.findByIdIn(studentWhiteList);
//
//        for( Student student : studentList){
//            log.info("student 입니다 : {} ", student.getName());
//        }

        //세번째 -1보다 큰 age이기 때문에 전부 출력 될것이다.
//        List<Student> studentList = studentRepository.findByAgeGreaterThan(-1);

//        for( Student student : studentList){
//            log.info("student 입니다 : {} ", student.getAge());
//        }

        //4번째 키워드 검색
//        List<Student> studentList = studentRepository.findByNameContainingIgnoreCase("y");
//        for( Student student : studentList){
//            log.info("student 입니다 : {} ", student.getName());
//        }

        List<Student> studentList = studentRepository.asd("jun");
        for( Student student : studentList) {
            log.info("학생이름: {}",student.getName());
        }



//    }
}}


