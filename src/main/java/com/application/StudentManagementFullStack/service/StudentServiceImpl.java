package com.application.StudentManagementFullStack.service;

import com.application.StudentManagementFullStack.entity.StudentEntity;
import com.application.StudentManagementFullStack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
