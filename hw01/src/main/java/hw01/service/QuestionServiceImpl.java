package hw01.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import hw01.dto.QuestionDto;

public class QuestionServiceImpl implements QuestionService {

	CsvService csvService;
	
	public QuestionServiceImpl(CsvService csvService) {
		super();
		this.csvService = csvService;
	}



	@Override
	public List<QuestionDto> getQuestions() {
		List<QuestionDto> questions = new ArrayList<QuestionDto>();
		
		InputStream is = getClass().getResourceAsStream("/questions.csv");
		
		List<String> stringQuestion = csvService.getListStringQuestion(is);
		
		for (String s : stringQuestion) {
			questions.add(QuestionDto.getQuestionFromString(s));
		}
		return questions;
	}



}
