package com.steverado9.student_management.controller;

import com.steverado9.student_management.entity.Student;
import com.steverado9.student_management.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handler method to handle list student and return model and view
    @GetMapping("/students")
    //Model: from org.springframwork.ui
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        //students is our view (students.html)
        return "students";
    }

    @GetMapping("/students/new")
    public String CreateStudentForm(Model model) {
        //create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm() {

    }
}
