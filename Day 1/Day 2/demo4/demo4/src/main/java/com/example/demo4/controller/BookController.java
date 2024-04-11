package com.example.demo4.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.model.Book;

@RestController
public class BookController
{
    @GetMapping("/Book")
    public Book getmethod()
    {
        Book obj=new Book("The Great Soldier","G.Gyan",new Date());
        return obj;
    }
}
