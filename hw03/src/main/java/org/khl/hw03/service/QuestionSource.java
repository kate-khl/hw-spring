package org.khl.hw03.service;

import java.util.ArrayList;
import java.util.List;

import org.khl.hw03.dto.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class QuestionSource {

	private CsvParser csv;
	
	@Value("${org.khl.csv.filename}")
	private String filename;

	@Autowired
	public QuestionSource(CsvParser utils) {
		super();
		this.csv = utils;
	}

	public List<QuestionDto> getQuestions() {		
		
		List<QuestionDto> questions = csv.getQuestionDtoList(getClass().getResourceAsStream("/" + filename));	
		return questions;
	}
	




}
