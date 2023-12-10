package com.example.com.formation.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.com.formation.sms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
