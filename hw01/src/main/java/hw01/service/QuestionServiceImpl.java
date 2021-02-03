package hw01.service;

import java.util.List;

import hw01.dto.QuestionDto;

public class QuestionServiceImpl implements QuestionService {

	private Utils utils;

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
