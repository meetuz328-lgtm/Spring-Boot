package com.xyz.demo.Repository;

import com.xyz.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface Student_Repo extends JpaRepository<Student, Integer> {
}
