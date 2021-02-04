package hw02.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import hw02.dto.QuestionDto;

@Component
public class Utils {
	
	public List<QuestionDto> getQuestionsFromFile(String fileName)
	{
		List<QuestionDto> questions = new ArrayList<>();	
		
		List<String> stringQuestion = getStringListFromCsv(getClass().getResourceAsStream("/" + fileName));
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
