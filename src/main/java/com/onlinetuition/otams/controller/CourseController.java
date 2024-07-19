package com.onlinetuition.otams.controller;

import com.onlinetuition.otams.model.Course;
import com.onlinetuition.otams.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course savedCourse = courseService.createCourse(course);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long courseId) {
        Course course = courseService.getCourseById(courseId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @DeleteMapping("/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>("Course successfully deleted", HttpStatus.OK);
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long courseId, @RequestBody Course course) {
        course.setId(courseId);
        Course updatedCourse = courseService.updateCourse(course);
        return new ResponseEntity<>(updatedCourse, HttpStatus.OK);
    }
}





//package com.onlinetuition.otams.controller;
//
//import com.onlinetuition.otams.model.Course;
//import com.onlinetuition.otams.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("course/offered")
//public class CourseController {
//
//    @Autowired
//    private CourseService courseService;
//
//    @PostMapping("/add/course")
//    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
//        Course savedCourse =  courseService.createCourse(course);
//        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/course/list")
//    public ResponseEntity<List<Course>> getAllCourses() {
//        List<Course> courses = courseService.getAllCourses();
//        return new ResponseEntity<>(courses, HttpStatus.OK);
//    }
//
//    @GetMapping("/geT/Id")
//    public ResponseEntity<Course> getCourseById(@PathVariable("courseId") Long courseId) {
//        Course course = courseService.getCourseById(courseId);
//        return new ResponseEntity<>(course, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/Id")
//    public ResponseEntity<String> deleteCourse(@PathVariable("courseId") Long courseId) {
//        courseService.deleteCourse(courseId);
//        return new ResponseEntity<String>("Course Successful Deleted", HttpStatus.OK);
//    }
//
//    @PutMapping("update/Id")
//    public ResponseEntity<Course> updateCourse(@PathVariable("courseId") Long courseId, Course course) {
//        course.setCourseId(courseId);
//        Course courseupdate = courseService.updateCourse(course);
//        return new ResponseEntity<>(courseupdate, HttpStatus.OK);
//    }
//}
