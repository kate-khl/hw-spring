package org.khl.hw03;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.khl.hw03.dto.QuestionDto;
import org.khl.hw03.service.LocalizationService;
import org.khl.hw03.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Application {
	
	private Scanner scanner; 
	private PersonData personData;
	private QuestionService questionService;
	private LocalizationService locService;
	
	@Autowired
	public Application(Scanner scanner, PersonData personData, QuestionService questionService, LocalizationService locService) {
		this.scanner = scanner;
		this.personData = personData;
		this.questionService = questionService;
		this.locService = locService;
	}

	@PostConstruct
	public void start() {
		
		setLocalization();
		greeting();
		
		List<QuestionDto> questions = questionService.getQuestions();
		for(QuestionDto q : questions) {
			askQuestion(q);
			checkAnswer(q, scanner.nextLine());
		}
		showResult();
	}
	
	private void greeting() {
		System.out.println(locService.getEnterName());
		personData.setName(scanner.nextLine());
		System.out.println(locService.getHelloUser(personData.getName()));
	}
	
	private Boolean checkAnswer(QuestionDto q, String answer) {
		Boolean result = answer.equals(q.getTrueAnswer());
		personData.setAnswer(q.getQuestionNumber(), result);
		System.out.println(locService.getResult() + result + "\n");
		return result;	
	}
	
	private void askQuestion(QuestionDto q) {
		System.out.println(locService.getAnswerTheQuestion());
		System.out.println("�" + q.getQuestionNumber() + " " 
							+ q.getQuestion() + "\n " + locService.getAnsverOption() 
							+  " \n" + q.getVariantsAnsvers().toString());
	}
	
	private void showResult() {
		System.out.println(personData.getName() + ", " + locService.getCorrectAnsvers() + 
	personData.countOfTrueAnswers() + " " + locService.getOutOf() +  personData.countOfAnswers());
		
	}
	
	private void setLocalization() {
		System.out.println("What is your language: ru/en ?");
		String strLocale = scanner.nextLine();
		if (strLocale.equals("ru")) personData.setLocale(new Locale("ru", "RU"));	
		else if (strLocale.equals("en")) personData.setLocale(Locale.ENGLISH);
		else {
			System.out.println("Invalid input");
			setLocalization();
		}
		locService.setLocale(personData.getLocale());
	}
}
