package armul.java.classes;

public class StringBuilderApp {
	public static void main(String[] args) {


		StringBuilder builder = new StringBuilder();

		builder.append("ari");
		builder.insert(3, "\n");
		builder.append("ar");
		builder.append("i");

		System.out.println(builder.toString().toLowerCase());
	}
}
