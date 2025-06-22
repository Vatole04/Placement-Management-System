package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveAdmin(Student admin) {
		// TODO Auto-generated method stub
		return studentRepository.save(admin);
	}
	
    @Override
    public List<Student> fetchAdminList() {
        return studentRepository.findAll();
    }

   @Override
   public Student fetchAdminById(Long adminId) {
	   return studentRepository.findById(adminId).get();
   }
	
   @Override
   public void deleteAdminById(Long adminId) {
	   studentRepository.deleteById(adminId);
   }


	/*
	 * @Override public Student updateAdmin(Long adminId, Student admin) { Student
	 * admDB = studentRepository.findById(adminId).get();
	 * 
	 * if(Objects.nonNull(admin.getName()) && !"".equalsIgnoreCase(admin.getName()))
	 * { admDB.setName(admin.getName()); }
	 * 
	 * if(Objects.nonNull(admin.getPassword()) &&
	 * !"".equalsIgnoreCase(admin.getPassword())) {
	 * admDB.setPassword(admin.getPassword()); }
	 * 
	 * return studentRepository.save(admDB); }
	 */


}
