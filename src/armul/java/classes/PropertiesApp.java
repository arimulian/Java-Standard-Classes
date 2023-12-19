package armul.java.classes;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
	public static void main(String[] args) {

		Properties properties = new Properties();
		try {
		properties.load(new FileInputStream("application.properties"));

			System.out.println(properties.getProperty("database.host"));
			System.out.println(properties.getProperty("database.port"));
		}catch (FileNotFoundException exception){
			exception.printStackTrace();
		}catch (IOException ioException){
			ioException.printStackTrace();
		}


		Properties createProperties = new Properties();
		createProperties.setProperty("name", "Ari Muliansyah Manurung" );
		createProperties.setProperty("email", "arimuliansyahManurung@gmail.com");

		try {
		createProperties.store(new FileOutputStream("name.properties"), "properties");
		}catch (FileNotFoundException exception){
			exception.printStackTrace();
		}catch (IOException ioException){
			ioException.printStackTrace();
		}
	}
}
