package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	Student saveAdmin(Student admin);

	List<Student> fetchAdminList();

	Student fetchAdminById(Long adminId);

	void deleteAdminById(Long adminId);

	//Student updateAdmin(Long adminId, Student admin);

}
