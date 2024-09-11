package com.guardians.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardians.entity.Student;
import com.guardians.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
