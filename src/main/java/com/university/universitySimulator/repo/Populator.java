package com.university.universitySimulator.repo;

import com.university.universitySimulator.model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Populator implements CommandLineRunner {
    private Courserepository courseRepo;

    public Populator(Courserepository courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public void run(String... args) throws Exception{
        Course course1 = new Course("Java",3,60,"Fall 2022");
        courseRepo.save(course1);
        Course course2 = new Course("C#", 3,60,"Spring 2023");
        courseRepo.save(course2);
        Course course3 = new Course("Intro to lollygagging", 7,100,"Spring 2023");
        courseRepo.save(course3);
    }
}
