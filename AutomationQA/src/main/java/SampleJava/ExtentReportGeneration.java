package SampleJava;

import java.io.File;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class ExtentReportGeneration {

	public ExtentReports report;
	public ExtentTest test;
	
	@BeforeTest
	public void setupReport(){
		
		report=new ExtentReports(System.getProperty("user.dir")+"\\target\\ExtentReportGeneration.html"
				,true,DisplayOrder.OLDEST_FIRST);
		report.loadConfig(new File(System.getProperty("user.dir")+"\\resources\\ReportsConfig.xml"));
		
	}
	
	@Test
	public void test1(){
		test=report.startTest("test1");
		System.out.println("test1!!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2(){
		test=report.startTest("test2");
		System.out.println("test2!!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3(){
		test=report.startTest("test3");
		System.out.println("test3!!");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4(){
		test=report.startTest("test4");
		System.out.println("test4!!");
		throw new SkipException("skipping");
	}
	
	@AfterMethod
	public void completeTest(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			test.log(LogStatus.FAIL, result.getName()+"  got failed!!");
		}
		else if(result.getStatus()==ITestResult.SKIP){
			test.log(LogStatus.SKIP, result.getName()+" got skipped!!");
		}
		else
			test.log(LogStatus.PASS, result.getName()+" got passed!!");
		
		report.endTest(test);
	}
	
	@AfterTest
	public void endReport(){
		report.flush();
		
	}
	
}
