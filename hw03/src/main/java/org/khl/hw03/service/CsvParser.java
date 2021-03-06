package org.khl.hw03.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.khl.hw03.dto.QuestionDto;
import org.springframework.stereotype.Component;

@Component
public class CsvParser {
	
	public List<QuestionDto> getQuestionDtoList(InputStream is) {
		
		List<QuestionDto> questions = new ArrayList<>();	
		
		List<String> stringQuestion = getStringListFromCsv(is);
		for (String s : stringQuestion) {
			questions.add(getQuestionFromCsvString(s));
		}
		return questions;
		
	}
	
	private List<String> getStringListFromCsv(InputStream is)
	{
		List<String> stringList = new ArrayList<>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while((line = reader.readLine()) != null ) {
				stringList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringList;
	}
	
	private QuestionDto getQuestionFromCsvString (String qString) {
		
		String[] fields = qString.split(",");
		
		QuestionDto question = new QuestionDto();
		question.setQuestionNumber(Integer.parseInt(fields[0]));
		question.setQuestion(fields[1]);
		question.setVariantsAnsvers(Arrays.asList(fields[2].split(";")));
		question.setTrueAnswer(fields[3]);
		return question;
	}

}
