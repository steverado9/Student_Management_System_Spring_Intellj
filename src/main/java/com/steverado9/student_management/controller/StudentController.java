package com.steverado9.student_management.controller;

import com.steverado9.student_management.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handler method to handle list student and return model and view
    @GetMapping()
    public String listStudent() {}
}
