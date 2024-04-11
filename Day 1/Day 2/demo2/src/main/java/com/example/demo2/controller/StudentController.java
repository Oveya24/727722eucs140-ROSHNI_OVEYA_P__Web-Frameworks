package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.Student;

@RestController
public class StudentController
{
    @GetMapping("/students")
    public String getmethod()
    {
        Student s=new Student("Nithish",22);
        String a="Student created:"+s.getName()+",Age:"+s.getAge();
        return a;
    }
}
