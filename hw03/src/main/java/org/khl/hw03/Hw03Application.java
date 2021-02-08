package org.khl.hw03;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class Hw03Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw03Application.class, args);
	}
	
    @Bean
    public Scanner getScanner() {
    	return new Scanner(System.in);
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
