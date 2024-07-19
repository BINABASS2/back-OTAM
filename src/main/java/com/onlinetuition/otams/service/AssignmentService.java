package com.onlinetuition.otams.service;

import com.onlinetuition.otams.repository.AssignmentRepo;
import org.hibernate.sql.ast.tree.update.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {

        @Autowired
        private AssignmentRepo assignmentRepo;

        public List<com.onlinetuition.otams.model.Assignment> findAll() {
            return assignmentRepo.findAll();
        }

        public com.onlinetuition.otams.model.Assignment findById(Long id) {
            return assignmentRepo.findById(id).orElse(null);
        }

        public void deleteById(Long id) {
            assignmentRepo.deleteById(id);
        }
    }
