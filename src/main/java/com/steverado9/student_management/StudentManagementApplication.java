package com.steverado9.student_management;

import com.steverado9.student_management.entity.Student;
import com.steverado9.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Isaac", "Stephen", "isaac@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Awom", "Joseph", "awom@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Uguaru", "Emma", "emma@gmail.com");
		studentRepository.save(student3);

	}
}
