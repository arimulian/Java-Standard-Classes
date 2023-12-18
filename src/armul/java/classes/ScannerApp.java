package armul.java.classes;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("nama : ");
		String result = scanner.nextLine();
		System.out.println("Hi " + result);
	}
}
