package hw01;

import java.util.HashMap;
import java.util.Map;

public class PersonData {

	private String name;
	private Map<Integer, Boolean> answers = new HashMap<>();
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
}
