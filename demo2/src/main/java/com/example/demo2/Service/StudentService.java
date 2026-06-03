package com.example.demo2.Service;

import com.example.demo2.Model.Student;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    static List<Student> students = new ArrayList<Student>();

    static{
        students.add(new Student(1, "ABC", "XYZ"));
        students.add(new Student(2, "DEF", "PQR"));
        students.add(new Student(3, "GHI", "MNO"));
    }
    public static List<Student> getAllStudents() {
        return students;
    }
    public static Student getStudentByRollNo(int rollNo) {
        for(Student i : students) {
            if(i.getRollNo() == rollNo) {
                return i;
            }
        }

        return null;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> addListOfStudents(List<Student> studentss) {
        students.addAll(studentss);
        return students;
    }

    public Student updateStudent(Student student) {
        for(Student i : students) {
            if(i.getRollNo() == student.getRollNo()) {
                if(student.getName() != null) {
                    i.setName(student.getName());
                }
                if(student.getTech() != null) {
                    i.setTech(student.getTech());
                }
            }
        }

        return student;
    }

    public void deleteStudent(int rollNo) {
        students.removeIf(i -> i.getRollNo() == rollNo);
    }
}