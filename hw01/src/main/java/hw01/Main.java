package hw01;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа по проведению тестирования студентов
 * В ресурсах хранятся вопросы и различные ответы к ним в виде CSV файла.
 * Программа должна спросить у пользователя имя,
 * спросить вопросы из CSV-файла и вывести результат тестирования.
 *
 * Зависимости должны быть настроены в IoC контейнере.
 *
 * Использовать xml-конфигурацию
 */


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("context.xml");
		
		context.getBean(Application.class).start();
	}
	
}
