package SampleJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SwitchingBetweenFramesDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Tutorial']"))).build().perform();
		Thread.sleep(3000);
		//switching to frame
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//img[@class='preload-me lazyloading']")).click();
		
		//switching back
		driver.switchTo().defaultContent();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Tools']"))).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
