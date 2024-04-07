package com.project1.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/studentName")
    @ResponseBody
    public String name(@RequestParam String studentName)
    {
        return "Welcome "+studentName+"!";
    }
}