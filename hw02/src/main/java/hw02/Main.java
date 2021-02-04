package hw02;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
	
}
