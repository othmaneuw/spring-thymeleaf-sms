package com.example.com.formation.sms.service.iplm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.formation.sms.entity.Student;
import com.example.com.formation.sms.repository.StudentRepository;
import com.example.com.formation.sms.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	

	@Autowired
	   private StudentRepository studentRepository;
	   
       @Override
       public List<Student> getAllStudents(){
    	   return studentRepository.findAll(); 
       }
       

	@Override
   	public Student saveStudent(Student student) {
   		return studentRepository.save(student);
   	}
	
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
       
}
