package com.onlinetuition.otams.service;

import com.onlinetuition.otams.model.Admission;
import com.onlinetuition.otams.repository.AdmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmissionService {

        @Autowired
        private AdmissionRepo admissionRepo;

        public List<Admission> findAll() {
            return admissionRepo.findAll();
        }

        public Admission save(Admission admission) {
            return admissionRepo.save(admission);
        }

        public Admission findById(Long id) {
            return admissionRepo.findById(id).orElse(null);
        }

        public void deleteById(Long id) {
            admissionRepo.deleteById(id);
        }
    }
