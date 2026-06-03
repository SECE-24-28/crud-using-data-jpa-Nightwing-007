package com.example.dataJPA.Controller;

import com.example.dataJPA.Model.Student;
import com.example.dataJPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService = new StudentService();

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
