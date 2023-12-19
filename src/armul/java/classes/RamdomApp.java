package armul.java.classes;

import java.util.Random;

public class RamdomApp {
	public static void main(String[] args) {

		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			int randomNumber = random.nextInt(2000);
			System.out.println(randomNumber);
		}
	}
}
