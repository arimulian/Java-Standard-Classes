package armul.java.classes;

import java.util.UUID;

public class UUIDApp {
	public static void main(String[] args) {

		UUID uuid = UUID.randomUUID();
		String key = uuid.toString();
		for (int i = 1; i < 50 ; i++) {
			System.out.println(key);
		}
	}
}
