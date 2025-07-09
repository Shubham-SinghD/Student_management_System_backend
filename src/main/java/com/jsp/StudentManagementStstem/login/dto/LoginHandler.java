package com.jsp.StudentManagementStstem.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor

@Data
public class LoginHandler {
	private String email;
	private long mobile;
	private String password;
}
