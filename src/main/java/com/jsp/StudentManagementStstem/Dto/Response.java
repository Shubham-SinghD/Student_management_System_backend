package com.jsp.StudentManagementStstem.Dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jsp.StudentManagementStstem.Dto.response.TextData2;

import lombok.Data;

@Component
@Data
public class Response {
	
	@JsonProperty("session")
	private Session session;
	
	@JsonProperty("txtData")
	private TextData txtData;

}
