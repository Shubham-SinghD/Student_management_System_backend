package com.jsp.StudentManagementStstem.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.StudentManagementStstem.Dto.ResponseWrapper;
import com.jsp.StudentManagementStstem.Dto.ResponseWrapper2;
import com.jsp.StudentManagementStstem.Dto.Responseresult;
import com.jsp.StudentManagementStstem.entity.LoginData;
import com.jsp.StudentManagementStstem.login.dto.LoginHandler;
import com.jsp.StudentManagementStstem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/addStudent")
	public ResponseEntity<Map<String, String>> addStudent1(@RequestBody ResponseWrapper rs) {
		studentService.adding(rs);
		return new  ResponseEntity<Map<String, String>>(Map.of("Status","Student Added"),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getSingleStudent")
	public ResponseWrapper getData(@RequestParam Long studentRollno,@RequestParam String sectionName ) {
		System.out.println(sectionName+"    "+studentRollno);
		return studentService.getPartiStudent(sectionName,studentRollno);
	}
	
	@GetMapping("/GetAllData")
	public Responseresult getDataAll() {
		return studentService.getAllDetails();
	}
	
	@GetMapping("/sectionData")
	public ResponseWrapper2 getSectionData(@RequestParam String sectionName) {
		return studentService.sortBySection(sectionName);
	}
	
	@DeleteMapping("/deleted")
	public ResponseEntity<Map<String, String>> deleteStudent(@RequestParam Long studentRollno){
		studentService.deleteData(studentRollno);
	return new  ResponseEntity<Map<String, String>>(Map.of("Status","Student Delete"),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/register")
	public   ResponseEntity<Map<String , String>> setRegister(@RequestBody LoginData ld) {
		studentService.register(ld);
		return new ResponseEntity<Map<String,String>>(Map.of("Status","Register Successful"),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/login")
	public LoginData login(@RequestBody LoginHandler loginHandler) {
		return studentService.validate(loginHandler);
	}
	
}
