package SampleJava;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestCase {
	
	@Test
	@Parameters({"user","pass"})
	public void test(String user,String pass){
		
		System.out.println("First parameter "+user+" Second Parameter "+pass);
		
	}

}
