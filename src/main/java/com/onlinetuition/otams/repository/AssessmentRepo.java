package com.onlinetuition.otams.repository;

import com.onlinetuition.otams.model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepo extends JpaRepository<Assessment, Long> {
}
