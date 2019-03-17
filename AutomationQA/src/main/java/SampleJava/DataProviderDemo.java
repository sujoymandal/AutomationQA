package SampleJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test
	@DataProvider(name="provider")
	public Object[][] getData(){
		
		Object[][] data={{"abc","xyz"},{"abc1","xyz1"}};
		return data;
		
	}
	
	@Test(dataProvider="providerl")
	public void catchData(){
		
	}
}