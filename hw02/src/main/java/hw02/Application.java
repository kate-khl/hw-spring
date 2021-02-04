package hw02;

import java.util.List;
import java.util.Scanner;

import hw02.dto.QuestionDto;
import hw02.service.QuestionService;

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
			askQuestion(q);
			checkAnswer(q, scanner.nextLine());
		}
		showResult();
	}
	
	private void greeting() {
		System.out.println("������! ������ ���� ��� :)");
		personData.setName(scanner.nextLine());
		System.out.println("����� ���������� �� ������������, " + personData.getName());
	}
	
	private Boolean checkAnswer(QuestionDto q, String answer) {
		Boolean result = answer.equals(q.getTrueAnswer());
		personData.setAnswer(q.getQuestionNumber(), result);
		System.out.println("���������: " + result + "\n");
		return result;	
	}
	
	private void askQuestion(QuestionDto q) {
		System.out.println("�������� �� ������: ");
		System.out.println("�" + q.getQuestionNumber() + " " 
							+ q.getQuestion() + "\n �������� ������: \n" + q.getVariantsAnsvers().toString());
	}
	
	private void showResult() {
		System.out.println(personData.getName() + ", ���������� �������: " + 
	personData.countOfTrueAnswers() + " �� " + personData.countOfAnswers());
		
	}
}
