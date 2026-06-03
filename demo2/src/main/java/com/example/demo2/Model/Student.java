package com.example.demo2.Model;

import lombok.*;

@Data//All getter and setter methods are generated automatically
@AllArgsConstructor//Constructor is generated automatically
@NoArgsConstructor//No-args constructor is generated automatically
public class Student {
    private int rollNo;
    private String name;
    private String tech;
}
