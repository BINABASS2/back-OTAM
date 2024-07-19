package com.onlinetuition.otams.controller;

import com.onlinetuition.otams.model.Admission;
import com.onlinetuition.otams.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/admissions")
    public class AdmissionController {

        @Autowired
        private AdmissionService admissionService;

        @GetMapping
        public List<Admission> getAllAdmissions() {
            return admissionService.findAll();
        }

        @GetMapping("/{id}")
        public Admission getAdmissionById(@PathVariable Long id) {
            return admissionService.findById(id);
        }

        @PostMapping
        public Admission createAdmission(@RequestBody Admission admission) {
            return admissionService.save(admission);
        }

        @PutMapping("/{id}")
        public Admission updateAdmission(@PathVariable Long id, @RequestBody Admission admission) {
            admission.setId(id);
            return admissionService.save(admission);
        }

        @DeleteMapping("/{id}")
        public void deleteAdmission(@PathVariable Long id) {
            admissionService.deleteById(id);
        }
    }
