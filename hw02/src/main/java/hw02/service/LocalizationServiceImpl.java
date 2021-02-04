package hw02.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import hw02.PersonData;

@Component
public class LocalizationServiceImpl implements LocalizationService {

	private MessageSource ms;
	private Locale locale;
	
	@Autowired
	public LocalizationServiceImpl(MessageSource ms) {
		super();
		this.ms = ms;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public String getEnterName() {
		return ms.getMessage("enter.name", null, locale);
	}

	@Override
	public String getHelloUser(String name) {
		return ms.getMessage("hello.user", new String[] {name}, locale);
	}

	@Override
	public String getAnswerTheQuestion() {
		return ms.getMessage("answer.quest", null, locale);
	}

	@Override
	public String getResult() {
		return ms.getMessage("result", null, locale);
	}

	@Override
	public String getAnsverOption() {
		return ms.getMessage("answers.variants", null, locale);
	}

	@Override
	public String getCorrectAnsvers() {
		return ms.getMessage("ñorrect.answers", null, locale);
	}

	@Override
	public String getOutOf() {
		return ms.getMessage("out.of", null, locale);
	}

}
