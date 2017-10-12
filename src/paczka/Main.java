package paczka;

import java.util.Properties;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.home"));
		PropertiesReader propertiesReader = new PropertiesReader("config.properties");
		Properties pr = propertiesReader.load();
		System.out.println(pr.get("c"));

	}

}
