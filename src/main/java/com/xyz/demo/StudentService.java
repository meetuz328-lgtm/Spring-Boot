package com.xyz.demo;

import com.xyz.demo.Entity.Student;
import com.xyz.demo.Repository.Student_Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService{

    private final Student_Repo student_repo;

    public List<Student>getAllStudents(){
        System.out.println("Received Student: "+ student_repo);
        return student_repo.findAll();
    }
    @Autowired
    private Student_Repo studentRep;

    public Student detailsofstudent(Student student){
        return studentRep.save(student);
    }

    }

