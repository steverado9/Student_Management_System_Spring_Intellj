package com.steverado9.student_management.repository;

import com.steverado9.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//the type of jprepository is student and type of id

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
