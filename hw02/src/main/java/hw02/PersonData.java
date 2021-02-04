package hw02;

import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PersonData {

	private String name;
	private Map<Integer, Boolean> answers = new HashMap<>();
	private Locale locale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnswer(Integer qNumber, Boolean result) {
		answers.put(qNumber, result);
	}
	
	public Boolean getAnswer(Integer qNumber) {
		return answers.get(qNumber).booleanValue();	
	}
	
	public Integer countOfTrueAnswers() {
		Integer count = 0;
		for (Boolean t : answers.values()) {
			if(t) count++;
		}
		return count;
	}
	public Integer countOfAnswers() {
		return answers.size();
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	
}
