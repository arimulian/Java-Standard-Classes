package armul.java.classes;

public class NumberClassesApp {

	public static void main(String[] args) {

		Integer value = 1_000_000;
		Long valueLong = value.longValue();

		System.out.println(valueLong.getClass().getSimpleName());

		String valueString = "1000000";
		int valueInt = Integer.parseInt(valueString);
		System.out.println(valueInt);

		Integer valueInteger = Integer.valueOf(valueString);
		System.out.println(valueInteger.getClass().getSimpleName());

	}
}
