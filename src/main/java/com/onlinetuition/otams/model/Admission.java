package com.onlinetuition.otams.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.ast.tree.update.Assignment;

import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admission {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String studentName;

//        @OneToMany(mappedBy = "admission")
//        private Set<Assessment> assessments;
//
//        @OneToMany(mappedBy = "admission")
//        private Set<Assignment> assignments;
    }
