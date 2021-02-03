package hw01;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа по проведению тестирования студентов
 * В ресурсах хранятся вопросы и различные ответы к ним в виде CSV файла (5 вопрсов).
 * Программа должна спросить у пользователя фамилию и имя,
 * спросить 5 вопросов из CSV-файла и вывести результат тестирования.
 *
 * Все сервисы в программе должны решать строго определённую задачу.
 * Зависимости должны быть настроены в IoC контейнере.
 *
 *
 * Локализовать выводимые сообщения и вопросы теста.
 *
 * И переписать конфигурацию в виде Java + Annotation-based конфигурации.
 */


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("context.xml");
		
		context.getBean(Application.class).start();
	}
	
}
