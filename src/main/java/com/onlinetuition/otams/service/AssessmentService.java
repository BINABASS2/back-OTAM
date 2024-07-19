package com.onlinetuition.otams.service;

import com.onlinetuition.otams.model.Assessment;
import com.onlinetuition.otams.repository.AssessmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

        @Autowired
        private AssessmentRepo assessmentRepo;

        public List<Assessment> findAll() {
            return assessmentRepo.findAll();
        }

        public Assessment save(Assessment assessment) {
            return assessmentRepo.save(assessment);
        }

        public Assessment findById(Long id) {
            return assessmentRepo.findById(id).orElse(null);
        }

        public void deleteById(Long id) {
            assessmentRepo.deleteById(id);
        }
    }