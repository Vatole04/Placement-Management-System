package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

import com.example.demo.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
    public Student saveAdmin(@RequestBody Student admin) {
       
        return studentService.saveAdmin(admin);
    }
	
	   @GetMapping("/student")
	    public List<Student> fetchAdminList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return studentService.fetchAdminList();
	    }
	    


	    @GetMapping("/student/{id}")
	    public Student fetchAdminById(@PathVariable("id") Long adminId)
	            {
	        return studentService.fetchAdminById(adminId);
	    }
	    
	    @DeleteMapping("/student/{id}")
	    public String deleteAdminById(@PathVariable("id") Long adminId) {
	    	studentService.deleteAdminById(adminId);
	        return "Admin deleted Successfully!!";
	    }
	    
		/*
		 * @PutMapping("/admin/{id}") public Student updateAdmin(@PathVariable("id")
		 * Long adminId,
		 * 
		 * @RequestBody Student admin) { return
		 * studentService.updateAdmin(adminId,admin); }
		 */


}
