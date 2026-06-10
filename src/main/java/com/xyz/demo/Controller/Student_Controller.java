package com.xyz.demo.Controller;

import com.xyz.demo.Entity.Student;
import com.xyz.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Service
@RequestMapping("/api/students")

public class Student_Controller {

    @Autowired
    private StudentService studentService;

    // Use a forward slash for the mapping path
    @PostMapping("/addStudent")

    public Student postDetails(@RequestBody Student student) {
        return studentService.detailsofstudent(student);
    }
    }
