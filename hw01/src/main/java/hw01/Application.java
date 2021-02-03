package hw01;

import java.util.Scanner;

public class Application {
	private Scanner scanner; 
	
	public Application(Scanner scanner) {
		this.scanner = scanner;
	}

	public void start() {
		greeting();
		scan(scanner);
	}
	
	private static void scan(Scanner console) {
		System.out.println(console.nextLine());
		scan(console);
	}	
	
	public void greeting() {
		System.out.println("Привет! Введии свое имя :)");
	}
}
