package com.xyz.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int Id;
    @Column(name = "Marks")
    private int marks;
    @Column(name = "Name")
    private String name;
    @Column(name = "Email-ID")
    @JsonProperty("email_id")
    private String email_id;
    @Column(name = "DOB")
    private int dob;
}
