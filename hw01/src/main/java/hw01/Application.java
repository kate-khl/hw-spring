package hw01;

import java.util.List;
import java.util.Scanner;

import hw01.dto.QuestionDto;
import hw01.service.QuestionService;

public class Application {
	private Scanner scanner; 
	private PersonData personData;
	private QuestionService questionService;
	
	public Application(Scanner scanner, PersonData personData, QuestionService questionService) {
		this.scanner = scanner;
		this.personData = personData;
		this.questionService = questionService;
	}

	public void start() {
		greeting();
		List<QuestionDto> questions = questionService.getQuestions();
		
		for(QuestionDto q : questions) {
			System.out.println("Ответьте на вопрос: ");
			System.out.println("№" + q.getQuestionNumber() + " " 
								+ q.getQuestion() + " " + q.getVariantsAnsvers().toString());
			scan(scanner);
		}
		
	}
	
	private void scan(Scanner console) {
		console.nextLine();
		scan(console);
	}	
	
	public void greeting() {
		System.out.println("Привет! Введии свое имя :)");
		personData.setName(scanner.nextLine());
		System.out.println("Добро пожаловать на тестирование, " + personData.getName());
	}
}
