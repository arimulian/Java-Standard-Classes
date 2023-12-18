package armul.java.classes;

import java.util.Base64;

public class Base64App {
	public static void main(String[] args) {

		String encoded = "Ari Muliansyah Manurung";
		String base64 = Base64.getEncoder().encodeToString(encoded.getBytes());
		System.out.println(base64);

		var bytes = Base64.getDecoder().decode(base64);
		String result = new String(bytes);
		System.out.println(result);
	}
}
