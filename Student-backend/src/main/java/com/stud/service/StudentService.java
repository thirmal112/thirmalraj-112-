package com.stud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.stud.entity.Student;
import com.stud.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
    private StudentRepo StudentRepo;
	public List<Student> getAllStudent() {
        return StudentRepo.findAll();
    }
	}


