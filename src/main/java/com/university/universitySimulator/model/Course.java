package com.university.universitySimulator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private  long id;
    private String courseName;
    private int creditHours;
    private int duration;
    private String semester;

    public Course(String courseName, int creditHours, int duration, String semester) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.duration = duration;
        this.semester = semester;
    }

    public Course(){

    }

    
}
