package com.onlinetuition.otams.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Registered-Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name = "First-Names", nullable = false)
    private String firstName;

    @Column(name = "Last-Name", nullable = false)
    private String lastName;

    @Column(name = "Current-Address", nullable = false)
    private String address;

    @Column(name = "Valid-DOB", nullable = false)
    private LocalDate dob;

    @Column(name = "Current-Age", nullable = false)
    private int age;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Contact", nullable = false)
    private String Contact;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Course", nullable = false)
    private String Course;
}
