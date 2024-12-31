package com.jpa.baisc.repository;

import com.jpa.baisc.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
