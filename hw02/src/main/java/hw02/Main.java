package hw02;

import java.util.Scanner;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
* ������������ ��������� ��������� � ������� �����.
* � ���������� ������������ � ���� Java + Annotation-based ������������.
* */

@Configuration
@ComponentScan
public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Main.class);
		
		context.getBean(Application.class).start();
	}
	
	@Bean
	public Scanner scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	
	@Bean(name="messageSource")
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource ms
			= new ReloadableResourceBundleMessageSource();
		ms.setBasename("bundle");
		ms.setDefaultEncoding("UTF-8");
		return ms;
	}
	
}
