package com.xyz.demo.Service;

import com.xyz.demo.Entity.Student;
import com.xyz.demo.Repository.Student_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private Student_Repo studentRep;

    public List<Student> getAllStudents(){
        return studentRep.findAll();
    }

    public Student detailsofstudent(Student student){
        return studentRep.save(student);
    }

    }

