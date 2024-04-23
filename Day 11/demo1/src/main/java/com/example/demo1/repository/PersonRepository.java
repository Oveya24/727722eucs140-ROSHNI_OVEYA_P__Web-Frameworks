package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo1.model.Address;
import com.example.demo1.model.Person;

import jakarta.transaction.Transactional;

public interface PersonRepository extends JpaRepository<Person,Long>
{
    @Modifying
    @Transactional
    @Query("UPDATE Person p SET p.address=:address WHERE p.id=:id")
    public int saveById(@Param("id")Long id,@Param("address")Address address);

    // @Query("SELECT p,a FROM Person p RIGHT JOIN p.address a")
    // public List<Person> savedata();
}
