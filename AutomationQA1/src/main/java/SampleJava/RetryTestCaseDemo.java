package SampleJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestCaseDemo {
	
	@Test(retryAnalyzer=ClassImplementingRetryAnalizer.class)
	public void retryTest(){
		System.out.println("retryTest");
		Assert.assertTrue(false);
	}
	
	@Test
	public void simpleTest(){
		System.out.println("simpleTest");
		Assert.assertTrue(false);
	}

}
