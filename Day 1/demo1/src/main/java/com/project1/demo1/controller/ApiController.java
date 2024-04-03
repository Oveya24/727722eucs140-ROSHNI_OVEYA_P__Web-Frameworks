package com.project1.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController
{
    @GetMapping("/welcome")
    public String message()
    {
        return "Welcome Spring Boot!";
    }
}