package com.onlinetuition.otams.repository;

import com.onlinetuition.otams.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
