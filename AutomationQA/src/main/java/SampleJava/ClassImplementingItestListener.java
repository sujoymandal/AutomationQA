package SampleJava;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ClassImplementingItestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"started!!");
		
	}
//demo
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+"successfully completed!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"failed!!");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"skipped!!");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
