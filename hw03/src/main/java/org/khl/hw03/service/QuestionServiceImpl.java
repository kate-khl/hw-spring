package org.khl.hw03.service;

import java.util.List;

import org.khl.hw03.dto.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

	private Utils utils;

	@Autowired
	public QuestionServiceImpl(Utils utils) {
		super();
		this.utils = utils;
	}

	@Override
	public List<QuestionDto> getQuestions() {			
		List<QuestionDto> questions = utils.getQuestionsFromFile("questions.csv");
		return questions;
	}
	




}
