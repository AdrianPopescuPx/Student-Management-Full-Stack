package com.application.StudentManagementFullStack.repository;

import com.application.StudentManagementFullStack.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
