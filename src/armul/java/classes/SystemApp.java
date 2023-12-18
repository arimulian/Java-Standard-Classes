package armul.java.classes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemApp {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(SystemApp.class.getName());
		var env = System.getenv("OS");
		logger.log(Level.INFO, "Environment " + env);

	}
}
