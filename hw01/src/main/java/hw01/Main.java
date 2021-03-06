package hw01;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ��������� �� ���������� ������������ ���������
 * � �������� �������� ������� � ��������� ������ � ��� � ���� CSV �����.
 * ��������� ������ �������� � ������������ ���,
 * �������� ������� �� CSV-����� � ������� ��������� ������������.
 *
 * ����������� ������ ���� ��������� � IoC ����������.
 *
 * ������������ xml-������������
 */


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("context.xml");
		
		context.getBean(Application.class).start();
	}
	
}
