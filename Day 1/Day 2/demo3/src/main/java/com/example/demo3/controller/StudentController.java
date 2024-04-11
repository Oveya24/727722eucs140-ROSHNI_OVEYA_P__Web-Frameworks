package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.model.Student;

@RestController
public class StudentController
{
    @GetMapping("/student")
    public Student getmethod()
    {
        Student obj=new Student(1L,"John Doe","This is a student description.");
        return obj;
    }
}
