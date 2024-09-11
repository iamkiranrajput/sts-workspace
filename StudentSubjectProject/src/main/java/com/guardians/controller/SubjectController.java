package com.guardians.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guardians.entity.Subject;
import com.guardians.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
    	List<Subject>sub =subjectService.getAllSubjects();
    	sub.stream().forEach(t -> System.out.print(t));
        return sub;
        
    }
}
