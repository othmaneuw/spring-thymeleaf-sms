package com.example.com.formation.sms.service;

import java.util.List;

import com.example.com.formation.sms.entity.Student;

public interface IStudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
