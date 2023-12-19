package armul.java.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
	public static void main(String[] args) {

		String randomString ="Ari Muliansyah manurung08 Regular Expression01";
		Pattern pattern = Pattern.compile("[a-zA-Z]*[0-9]");

		Matcher matcher = pattern.matcher(randomString);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
