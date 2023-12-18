package armul.java.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
	public static void main(String[] args) {

		String[] names = {"Zhiqiang", "Roberto", "Jianhua"};
		StringJoiner joiner = new StringJoiner(", ","[", "]");

		for(String name : names){
			joiner.add(name);
		}
		System.out.println(joiner.toString());

		StringJoiner name = new StringJoiner(", ", "{","}");
		name.add("name 1").add("name 2").add("name 3");
		System.out.println(name);

	}
}
