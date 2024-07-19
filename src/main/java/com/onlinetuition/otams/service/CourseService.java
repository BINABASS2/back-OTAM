package com.onlinetuition.otams.service;

import com.onlinetuition.otams.model.Course;
import com.onlinetuition.otams.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourseById(Long courseId) {
        Optional<Course> optionalCourse = courseRepo.findById(courseId);
        return optionalCourse.get();
    }

    public void deleteCourse(Long courseId) {
        courseRepo.deleteById(courseId);
    }

    public Course updateCourse(Course course) {
        Course existingCourse = courseRepo.findById(course.getCourseId()).get();
        existingCourse.setCourseId(course.getCourseId());
        existingCourse.setCourseTitle(course.getCourseTitle());
        existingCourse.setCourseDescription(course.getCourseDescription());
        Course updateCourse = courseRepo.save(existingCourse);
        return updateCourse;
    }
}
