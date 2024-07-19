package com.onlinetuition.otams.repository;

import com.onlinetuition.otams.model.Admission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRepo extends JpaRepository<Admission, Long> {
}
