package com.onlinetuition.otams.service;

import com.onlinetuition.otams.model.Tutor;
import com.onlinetuition.otams.repository.TutorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

        @Autowired
        private TutorRepo tutorRepo;

        public List<Tutor> findAll() {
            return tutorRepo.findAll();
        }

        public Tutor save(Tutor tutor) {
            return tutorRepo.save(tutor);
        }

        public Tutor findById(Long id) {
            return tutorRepo.findById(id).orElse(null);
        }

        public void deleteById(Long id) {
            tutorRepo.deleteById(id);
        }
    }
