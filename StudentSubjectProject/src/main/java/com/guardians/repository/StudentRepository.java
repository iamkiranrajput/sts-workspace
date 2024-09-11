package com.guardians.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardians.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
