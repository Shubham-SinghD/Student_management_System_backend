package com.jsp.StudentManagementStstem.Dto.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jsp.StudentManagementStstem.Dto.StudentData;

import lombok.Data;
@Component
@Data
public class TextData2 {
	
	@JsonProperty("sectionName")
	private String section;
	
	@JsonProperty("data")
	private List<StudentData> datas;


}
