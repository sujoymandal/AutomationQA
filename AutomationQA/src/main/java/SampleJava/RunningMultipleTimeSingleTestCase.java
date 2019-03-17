package SampleJava;

import org.testng.annotations.Test;

public class RunningMultipleTimeSingleTestCase {
	
	@Test(invocationCount=3)
	public void test1(){
		System.out.println("test1!!");
	}

	@Test(invocationCount=4)
	public void test2(){
		System.out.println("test2!!");
	}

	@Test
	public void test3(){
		System.out.println("test3!!");
	}

}
