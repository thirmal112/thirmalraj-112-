package com.stud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.stud.entity.Student;
import com.stud.service.StudentService;

@RestController
@CrossOrigin("*")
public class studController {
	@Autowired
	
    private StudentService service;

    @GetMapping("student")
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }
	

}
