# Student Management System
This is a full-stack **Spring Boot** web application that manages list of students.
This project demonstrates how to use **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **MySQL** to build a functional system which manages a list of students.

---

## Feature

**Student Management**
- Add, update, view, and delete Students

## Technologies Used

| Technology | Purpose |
|-------------|----------|
| **Spring Boot** | Framework for building and running the app |
| **Spring MVC** | Handles routing and web logic |
| **Spring Data JPA (Hibernate)** |
| **Thymeleaf** | Server-side template engine for UI |
| **MySQL** | Database |
| **Bootstrap 5** | Front-end styling |

---
## ️ How to Run Locally

### 1. Clone the project
```bash
git clone https://github.com/steverado9/Student_Management_System_Spring_Intellj
cd Student_Management_System_Spring_Intellj
```
### 2. Configure the database in `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=create
```

### 3. Run the application
```bash
mvn spring-boot:run
```

### 4. Open your browser at:
```
http://localhost:8080
```
---