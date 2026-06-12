package com.xyz.demo.Controller;

import com.xyz.demo.Entity.Student;
import com.xyz.demo.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
@AllArgsConstructor

public class Student_Controller {

    @Autowired
    private StudentService studentService;

    @GetMapping("/StudentDetails")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/updateStudent")

    public Student postDetails(@RequestBody Student student) {
        return studentService.detailsofstudent(student);
    }
    }
