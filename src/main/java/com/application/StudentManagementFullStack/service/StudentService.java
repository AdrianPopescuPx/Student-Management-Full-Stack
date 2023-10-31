package com.application.StudentManagementFullStack.service;

import com.application.StudentManagementFullStack.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public StudentEntity saveStudent(StudentEntity studentEntity);
    public List<StudentEntity> getAllStudents();
}
