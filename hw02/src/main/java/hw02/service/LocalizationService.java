package hw02.service;

import java.util.Locale;

public interface LocalizationService {
	
	public void setLocale(Locale locale);

	public String getEnterName();
	
	public String  getHelloUser(String name);
	
	public String getAnswerTheQuestion();
	
	public String getResult();
	
	public String getAnsverOption();
	
	public String getCorrectAnsvers();
	
	public String getOutOf();
	
}
