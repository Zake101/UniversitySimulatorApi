package com.university.universitySimulator.repo;

import com.university.universitySimulator.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface Courserepository extends CrudRepository<Course, Long> {

}
