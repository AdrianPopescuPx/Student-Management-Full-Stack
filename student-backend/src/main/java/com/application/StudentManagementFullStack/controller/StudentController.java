package com.application.StudentManagementFullStack.controller;

import com.application.StudentManagementFullStack.entity.StudentEntity;
import com.application.StudentManagementFullStack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentEntity studentEntity) {
        studentService.saveStudent(studentEntity);
        return "New student added!";
    }

    @GetMapping("/all")
    public List<StudentEntity> getStudents() {
        return studentService.getAllStudents();
    }
}
