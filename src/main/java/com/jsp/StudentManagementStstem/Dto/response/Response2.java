package com.jsp.StudentManagementStstem.Dto.response;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jsp.StudentManagementStstem.Dto.Session;

import lombok.Data;
@Component
@Data
public class Response2 {
	
	@JsonProperty("session")
	private Session session;
	
	@JsonProperty("txtData")
	private TextData2 txtData2;

}
