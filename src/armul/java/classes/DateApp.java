package armul.java.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2022);

		Date date = cal.getTime();
		System.out.println(date);
	}
}
