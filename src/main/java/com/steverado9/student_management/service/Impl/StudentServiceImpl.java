package com.steverado9.student_management.service.Impl;

import com.steverado9.student_management.entity.Student;
import com.steverado9.student_management.repository.StudentRepository;
import com.steverado9.student_management.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public Student saveStudent(Student student) {
         Student result = studentRepository.findByEmail(student.getEmail());
        if (result != null) {
            System.out.println("student already exist");
            return null;
        }
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}
