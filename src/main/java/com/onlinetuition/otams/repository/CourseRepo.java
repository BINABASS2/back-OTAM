package com.onlinetuition.otams.repository;

import com.onlinetuition.otams.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
