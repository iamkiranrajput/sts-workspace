package com.app.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
