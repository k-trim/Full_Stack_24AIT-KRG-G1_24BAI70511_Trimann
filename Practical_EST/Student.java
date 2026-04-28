package com.example.problem4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void getEmail() {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void getCourse() {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }
}
