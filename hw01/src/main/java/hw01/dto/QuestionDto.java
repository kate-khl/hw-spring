package hw01.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionDto {

	private Integer questionNumber;
	private String question;
	private List<String> variantsAnsvers = new ArrayList<>();
	private String trueAnswer;
	


	public Integer getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getVariantsAnsvers() {
		return variantsAnsvers;
	}

	public void setVariantsAnsvers(List<String> variantsAnsvers) {
		this.variantsAnsvers = variantsAnsvers;
	}

	public String getTrueAnswer() {
		return trueAnswer;
	}

	public void setTrueAnswer(String trueAnswer) {
		this.trueAnswer = trueAnswer;
	}
	
}
