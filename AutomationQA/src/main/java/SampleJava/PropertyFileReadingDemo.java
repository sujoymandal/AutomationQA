package SampleJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadingDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				"\\resources\\PropertyFile.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.keySet());
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Grade"));
		System.out.println(prop.getProperty("Status"));
	
	}

}
