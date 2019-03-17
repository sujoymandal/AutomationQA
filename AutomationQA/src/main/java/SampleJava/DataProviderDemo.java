package SampleJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test
	@DataProvider(name="provider")
	public Object[][] getData(){
		
		
		return new Object[][] {{"abc","xyz"},{"abc1","xyz1"}};
		
	}
	
	@Test(dataProvider="provider")
	public void catchData(String user,String pwd){
		
		System.out.println(user+" and "+pwd);
		
	}
}