package com.application.StudentManagementFullStack.service;

import com.application.StudentManagementFullStack.entity.StudentEntity;
import com.application.StudentManagementFullStack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }
}
