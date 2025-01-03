package com.jpa.baisc.repository;

import com.jpa.baisc.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
//    List<Student> findByName(String name);

//    List<Student> findByIdIn(List<Long> idList);
    //List<Student> findByCourseIn(List<Course> courseList);


//    List<Student> findByAgeGreaterThan(int age);

    //키위드 검색
//    List<Student> findByNameContainingIgnoreCase(String keyword);

//    List<Student> findByNameOrderByEmailAsc(String name);
//    long countByAgeGreaterThan(int age);
//    long countByCourseName(String name);


    //@Param("name") String name의 name을 가지고와서 s.name에다가 가지고온 name을 넣어준다. 라고 이해하면 되는거네? 가지고온 name은 :name인거고?
    @Query("SELECT s FROM Student s WHERE s.name = :name")
    List<Student> asd(@Param("name") String name );

}
