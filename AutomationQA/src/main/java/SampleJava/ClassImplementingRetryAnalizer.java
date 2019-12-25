package SampleJava;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ClassImplementingRetryAnalizer implements IRetryAnalyzer{

	private int maxCount=3;
	private int exeCount=0;
	
	public boolean retry(ITestResult result) {
		if(exeCount<maxCount){
			System.out.println("retrying for .."+(exeCount+1));
			exeCount++;
			return true;
		}
		
		return false;
	}

}
