package com.example.demo2.Controller;

import com.example.demo2.Model.Student;
import com.example.demo2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{rollNo}")
    public Student getStudentById(@PathVariable int rollNo){
        return studentService.getStudentByRollNo(rollNo);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/students")
    public List<Student> addListOfStudents(@RequestBody List<Student> students){
        return studentService.addListOfStudents(students);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo){
        studentService.deleteStudent(rollNo);
        return "Student deleted successfully";
    }
}
