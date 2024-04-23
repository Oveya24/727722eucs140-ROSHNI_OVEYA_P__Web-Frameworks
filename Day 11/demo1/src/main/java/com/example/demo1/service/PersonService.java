package com.example.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Address;
import com.example.demo1.model.Person;
import com.example.demo1.repository.PersonRepository;

@Service
public class PersonService
{
    @Autowired
    PersonRepository r;
    public Person create(Person obj)
    {
        return r.save(obj);
    }
    public int createaddress(long id,Address obj)
    {
        return r.saveById(id,obj);
    }
    public List<Person> getlist()
    {
        return r.findAll();
    }
    public Optional<Person> getbyid(long id)
    {
        return r.findById(id);
    }
}
