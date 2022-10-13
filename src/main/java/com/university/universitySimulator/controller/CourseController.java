package com.university.universitySimulator.controller;

import com.university.universitySimulator.model.Course;
import com.university.universitySimulator.repo.Courserepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private Courserepository courseRepo;

    public CourseController(Courserepository courseRepo) {
        this.courseRepo = courseRepo;
    }


    @GetMapping("/courses")
    public Iterable<Course> getAllCourses(){
        return courseRepo.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getSingleCourse(@PathVariable long id) {
        return courseRepo.findById(id).get();
    }
}
