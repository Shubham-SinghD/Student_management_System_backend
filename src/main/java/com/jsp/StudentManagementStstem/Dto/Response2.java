package com.jsp.StudentManagementStstem.Dto;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Component
@Data
public class Response2 {
	
	@JsonProperty("sectionName")
	private Session session;
	
	@JsonProperty("txtData")
	private TextData2 txtData2;

}
