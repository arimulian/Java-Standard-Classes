package armul.java.classes;

public class StringApp {
	public static void main(String[] args) {
		String name = "Armul";


		System.out.println(name.hashCode());
		System.out.println(name.toLowerCase().hashCode());
		System.out.println(name.substring(2, name.length()).hashCode());
	}
}
