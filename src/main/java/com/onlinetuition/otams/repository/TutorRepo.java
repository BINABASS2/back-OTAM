package com.onlinetuition.otams.repository;

import com.onlinetuition.otams.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepo extends JpaRepository<Tutor, Long> {
}
