package com.example.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Address;
import com.example.demo1.model.Person;
import com.example.demo1.service.PersonService;

@RestController
public class PersonController
{
    @Autowired
    PersonService ps;
    @PostMapping("/person")
    public Person createperson(@RequestBody Person obj)
    {
        return ps.create(obj);
    }
    @PostMapping("address/person/{personId}")
    public int createaddress(@RequestBody Address obj,@PathVariable long personId)
    {
        return ps.createaddress(personId,obj);
    }
    @GetMapping("/person")
    public List<Person> getall()
    {
        return ps.getlist();
    }
    @GetMapping("/person/{personId}")
    public Optional<Person> getPerson(@PathVariable long personId)
    {
        return ps.getbyid(personId);
    }
}
