package com.jpa.baisc.repository;

import com.jpa.baisc.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
