package com.onlinetuition.otams.service;

import com.onlinetuition.otams.model.Student;
import com.onlinetuition.otams.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public static StudentRepo studentRepo;

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public static Student getStudentById(Long studentId) {
        Optional<Student> optionalStudent = studentRepo.findById(studentId);
        return optionalStudent.get();
    }

    public void deleteStudent(Long cstudentId) {
        Long studentId = null;
        studentRepo.deleteById(studentId);
    }

    public Student updateStudent(Student student) {
        Student existingStudent = studentRepo.findById(student.getStudentId()).get();
        existingStudent.setStudentId(student.getStudentId());
        existingStudent.setStudentId(student.getStudentId());
        existingStudent.setStudentId(student.getStudentId());
        Student updateStudent = studentRepo.save(existingStudent);
        return updateStudent;
    }
}
