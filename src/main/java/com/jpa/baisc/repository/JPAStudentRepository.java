package com.jpa.baisc.repository;

import com.jpa.baisc.domain.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class JPAStudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Student save(Student student){
        entityManager.persist(student);
        return student;
    }
}
