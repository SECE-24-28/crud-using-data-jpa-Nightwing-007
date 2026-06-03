package com.example.dataJPA.Service;

import com.example.dataJPA.Model.Student;
import com.example.dataJPA.Repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    StudentRepo repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(int id) {
        return repo.findById(id).get();
    }

    public void saveStudent(Student student) {
        repo.save(student);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
