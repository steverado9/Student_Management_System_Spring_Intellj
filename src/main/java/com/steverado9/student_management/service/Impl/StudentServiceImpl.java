package com.steverado9.student_management.service.Impl;

import com.steverado9.student_management.entity.Student;
import com.steverado9.student_management.repository.StudentRepository;
import com.steverado9.student_management.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        //This returns a list of students
        return studentRepository.findAll();
    }
}
