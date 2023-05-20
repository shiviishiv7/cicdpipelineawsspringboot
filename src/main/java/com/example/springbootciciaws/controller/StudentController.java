package com.example.springbootciciaws.controller;


import com.example.springbootciciaws.Student;
import com.example.springbootciciaws.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {


    @Autowired
    private StudentRepo studentRepo;

    @GetMapping
    public List<Student> getAllStudent(){
        List<Student> all = studentRepo.findAll();
        return all;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        Student save = studentRepo.save(student);
        return save;
    }





}
