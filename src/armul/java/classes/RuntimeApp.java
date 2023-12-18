package armul.java.classes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RuntimeApp {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(RuntimeApp.class.getName());

		Runtime runtime = Runtime.getRuntime();
		logger.log(Level.INFO,"Processors amount of threads " + (int) runtime.availableProcessors());
		logger.log(Level.INFO,"Total Memory in JVM " + (long) runtime.totalMemory());
		logger.log(Level.INFO,"Max Memory in JVM " + (long) runtime.maxMemory());
		logger.log(Level.INFO,"Free Memory in JVM " + (long) runtime.freeMemory());
	}
}
