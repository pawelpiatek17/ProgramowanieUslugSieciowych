package paczka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	String fileName;
	Properties properties;
	
	public PropertiesReader(String fileName) {
		this.fileName = fileName;
		properties = new Properties();
		try {
			FileInputStream input = new FileInputStream("./" + fileName);
			FileInputStream input2 = new FileInputStream(System.getProperty("user.home") +"/"+ fileName);
			properties.load(input2);
			properties.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Properties load(){
		return properties;
	}
}
