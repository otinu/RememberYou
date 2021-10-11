package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

// <Person, Long>は合ってる??
public interface PersonRepository extends JpaRepository<Person, Long> {

}
